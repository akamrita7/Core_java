package New2026.Queue;

public class Consumer implements Runnable{
    private final BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) { this.queue = queue; }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                String element = queue.denqueue();
                System.out.println("Consumed: " + element);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
