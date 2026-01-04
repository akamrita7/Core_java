package collectionImpl;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor
    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // Add element to end
    public void add(T element) {
        ensureCapacity();
        data[size++] = element;
    }

    // Get element by index
    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    // Remove element by index
    public T remove(int index) {
        checkIndex(index);
        @SuppressWarnings("unchecked")
        T removedElement = (T) data[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(data, index + 1, data, index, numMoved);
        }
        data[--size] = null; // clear to let GC do its work
        return removedElement;
    }

    // Return current size
    public int size() {
        return size;
    }

    // Ensure internal array has enough capacity
    private void ensureCapacity() {
        if (size == data.length) {
            int newCapacity = data.length * 2;
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    // Check for index out of bounds
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Element at index 1: " + list.get(1)); // Banana
        System.out.println("Removed element: " + list.remove(1)); // Banana
        System.out.println("Size after removal: " + list.size()); // 2
    }
}
