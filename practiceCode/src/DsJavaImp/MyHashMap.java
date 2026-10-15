package DsJavaImp;

import java.util.Objects;

public class MyHashMap<K, V> {

    private static class Node<K, V> {
        final int hash;
        final K key;
        V value;
        Node<K, V> next;

        Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private Node<K, V>[] table;
    private int size;
    private int capacity;
    private final float loadFactor;

    private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        this.capacity = DEFAULT_CAPACITY;
        this.loadFactor = DEFAULT_LOAD_FACTOR;
        this.table = new Node[capacity];
    }

    // ===================== PUT =====================
    public void put(K key, V value) {
        int hash = hash(key);
        int index = indexFor(hash);

        Node<K, V> head = table[index];

        // Check if key exists
        for (Node<K, V> node = head; node != null; node = node.next) {
            if (node.hash == hash && Objects.equals(node.key, key)) {
                node.value = value;
                return;
            }
        }

        // Insert at head (separate chaining)
        Node<K, V> newNode = new Node<>(hash, key, value, head);
        table[index] = newNode;
        size++;

        if (size > capacity * loadFactor) {
            resize();
        }
    }

    // ===================== GET =====================
    public V get(K key) {
        int hash = hash(key);
        int index = indexFor(hash);

        for (Node<K, V> node = table[index]; node != null; node = node.next) {
            if (node.hash == hash && Objects.equals(node.key, key)) {
                return node.value;
            }
        }

        return null;
    }

    // ===================== REMOVE =====================
    public V remove(K key) {
        int hash = hash(key);
        int index = indexFor(hash);

        Node<K, V> current = table[index];
        Node<K, V> prev = null;

        while (current != null) {
            if (current.hash == hash && Objects.equals(current.key, key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return current.value;
            }
            prev = current;
            current = current.next;
        }

        return null;
    }

    public int size() {
        return size;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // ===================== HASH =====================
    private int hash(K key) {
        return (key == null) ? 0 : key.hashCode() ^ (key.hashCode() >>> 16);
    }

    private int indexFor(int hash) {
        return hash & (capacity - 1);
    }

    // ===================== RESIZE =====================
    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = capacity * 2;
        Node<K, V>[] newTable = new Node[newCapacity];

        for (int i = 0; i < capacity; i++) {
            Node<K, V> node = table[i];
            while (node != null) {
                Node<K, V> next = node.next;

                int newIndex = node.hash & (newCapacity - 1);
                node.next = newTable[newIndex];
                newTable[newIndex] = node;

                node = next;
            }
        }

        table = newTable;
        capacity = newCapacity;
    }
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("A", 10);
        map.put("A", 20);
        map.put("B", 20);

        System.out.println(map.get("A")); // 10

        map.remove("A");

        System.out.println(map.get("A")); // null
        System.out.println(map.size());   // 1
    }
}

