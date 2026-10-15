package New2026.thread_packgae.oddEven;

public class OddEvenThreadExample {
    public static void main(String[] args) {
        int limit = 10; // Define the limit up to which numbers will be printed
        OddEvenPrinter printer = new OddEvenPrinter(limit);

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();
    }

}
