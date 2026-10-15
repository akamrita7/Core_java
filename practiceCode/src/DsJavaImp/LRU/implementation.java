package DsJavaImp.LRU;

public class implementation {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        System.out.println(lruCache.get(1)); // Output: 1 (moves 1 to MRU)
        lruCache.put(3, 3); // Evicts 2
        System.out.println(lruCache.get(2)); // Output: -1
        System.out.println(lruCache.get(3)); // Output: 3
    }
}
