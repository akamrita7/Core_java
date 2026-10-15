package New2026.thread_packgae;

public class PrintSequenceBy3Thread {
    public static void main(String[] args) {
    Print p1 = new Print(0);
    Print p2 = new Print(1);
    Print p3 = new Print(2);
    Thread t1 = new Thread(p1);
    Thread t2 = new Thread(p2);
    Thread t3 = new Thread(p3);
    t1.start();
    t2.start();
    t3.start();
}

}


