package DsJavaImp;

import java.util.concurrent.locks.ReentrantLock;

public class MyConcurrentHashMap<K, V> {

    private static final int DEFAULT_SEGMENT_COUNT = 16;
    private final Segment<K, V>[] segments;

    public MyConcurrentHashMap() {
        this(DEFAULT_SEGMENT_COUNT);
    }

    @SuppressWarnings("unchecked")
    public MyConcurrentHashMap(int segmentCount) {
        segments = new Segment[segmentCount];
        for (int i = 0; i < segmentCount; i++) {
            segments[i] = new Segment<>();
        }
    }

    // Hash spreading
    private int hash(Object key) {
        int h = key.hashCode();
        h ^= (h >>> 16);
        return h;
    }

    // Select segment
    private Segment<K, V> getSegment(Object key) {
        int hash = hash(key);
        int index = (segments.length - 1) & hash;
        return segments[index];
    }

    public void put(K key, V value) {
        if (key == null) throw new NullPointerException();
        getSegment(key).put(key, value);
    }

    public V get(K key) {
        if (key == null) throw new NullPointerException();
        return getSegment(key).get(key);
    }

    public void remove(K key) {
        if (key == null) throw new NullPointerException();
        getSegment(key).remove(key);
    }

    // ==========================
    // Segment Implementation
    // ==========================
    static class Segment<K, V> {

        private static final int DEFAULT_CAPACITY = 16;
        private static final float LOAD_FACTOR = 0.75f;

        private Entry<K, V>[] table;
        private int size;
        private final ReentrantLock lock = new ReentrantLock();

        @SuppressWarnings("unchecked")
        public Segment() {
            table = new Entry[DEFAULT_CAPACITY];
        }

        public void put(K key, V value) {
            lock.lock();
            try {
                int index = index(key);
                Entry<K, V> head = table[index];

                for (Entry<K, V> e = head; e != null; e = e.next) {
                    if (e.key.equals(key)) {
                        e.value = value;
                        return;
                    }
                }

                Entry<K, V> newEntry = new Entry<>(key, value);
                newEntry.next = head;
                table[index] = newEntry;
                size++;

                if (size >= table.length * LOAD_FACTOR) {
                    resize();
                }
            } finally {
                lock.unlock();
            }
        }

        public V get(K key) {
            int index = index(key);
            Entry<K, V> head = table[index];

            for (Entry<K, V> e = head; e != null; e = e.next) {
                if (e.key.equals(key)) {
                    return e.value;
                }
            }
            return null;
        }

        public void remove(K key) {
            lock.lock();
            try {
                int index = index(key);
                Entry<K, V> prev = null;
                Entry<K, V> curr = table[index];

                while (curr != null) {
                    if (curr.key.equals(key)) {
                        if (prev == null) {
                            table[index] = curr.next;
                        } else {
                            prev.next = curr.next;
                        }
                        size--;
                        return;
                    }
                    prev = curr;
                    curr = curr.next;
                }
            } finally {
                lock.unlock();
            }
        }

        private int index(K key) {
            int h = key.hashCode();
            h ^= (h >>> 16);
            return (table.length - 1) & h;
        }

        @SuppressWarnings("unchecked")
        private void resize() {
            Entry<K, V>[] oldTable = table;
            Entry<K, V>[] newTable = new Entry[oldTable.length * 2];

            for (Entry<K, V> head : oldTable) {
                while (head != null) {
                    Entry<K, V> next = head.next;
                    int index = (newTable.length - 1) & head.key.hashCode();
                    head.next = newTable[index];
                    newTable[index] = head;
                    head = next;
                }
            }
            table = newTable;
        }
    }

    // ==========================
    // Entry Node
    // ==========================
    static class Entry<K, V> {
        final K key;
        volatile V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

