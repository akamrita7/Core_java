package DsJavaImp.producerConsumerWaitNotify;

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait();  // wait until space available
        }

        buffer.add(value);
        System.out.println("Produced: " + value);

        notifyAll();  // notify consumers
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();  // wait until item available
        }

        int value = buffer.poll();
        System.out.println("Consumed: " + value);

        notifyAll();  // notify producers
        return value;
    }
}

