package New2026.Queue;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue<E>{
    private List<E> queue = new LinkedList<>();
    private int limit = 10;
    public BlockingQueue(int limit) { this.limit = limit; }
public synchronized void enqueue(E item) throws InterruptedException{
        while (this.queue.size() == limit){
            wait();
        }
        if(this.queue.size() == 0)
            notifyAll();
        this.queue.add(item);

}
    public synchronized E denqueue() throws InterruptedException{
        while (this.queue.size() ==0)
            wait();
        if (this.queue.size()==limit)
            notifyAll();
        return this.queue.removeFirst();

    }
    public static void main(String []args) throws InterruptedException {
        BlockingQueue<String> queue = new BlockingQueue<>(5);
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();

    }
}
