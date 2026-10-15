package New2026.thread_packgae.oddEven;

public class OddEvenPrinter {
    private final int limit;
    private boolean isOddTurn = true;

    public OddEvenPrinter(int limit) {
        this.limit = limit;
    }

    public synchronized void printOdd() {
        for (int i = 1; i <= limit; i += 2) {
            while (!isOddTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Odd: " + i);
            isOddTurn = false;
            notify();
        }

    }
    public synchronized void printEven() {
        for (int i = 2; i <= limit; i += 2) {
            while (isOddTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Even: " + i);
            isOddTurn = true;
            notify();
        }
    }

}
