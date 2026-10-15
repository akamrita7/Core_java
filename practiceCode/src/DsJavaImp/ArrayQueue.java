package DsJavaImp;

class ArrayQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        if(rear==capacity){
            int j = front;
            int i =0;
            while (j<capacity){
                arr[i++] = arr[j++];
            }
            front = 0;
            rear = i;
        }
        arr[rear++] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int data = arr[front];
        arr[front] = -1;
        front++;
        size--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue(5);
        aq.enqueue(3);
        aq.enqueue(1);
        aq.enqueue(2);
        aq.enqueue(4);
        aq.enqueue(5);
        System.out.println(aq.peek());
        System.out.println(aq.dequeue());
        System.out.println(aq.dequeue());
        aq.enqueue(8);
        aq.enqueue(9);
        System.out.println(aq.dequeue());
        System.out.println(aq.dequeue());

    }
}

