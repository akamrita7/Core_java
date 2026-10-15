package New2026.Queue;

public class Producer implements Runnable{
    private final BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) { this.queue = queue; }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                String element = "Element " + i;
                queue.enqueue(element);
                System.out.println("Produced: " + element);
                Thread.sleep(1000); // Simulate some work
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
