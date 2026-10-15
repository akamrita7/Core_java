package New2026.thread_packgae;

import java.util.concurrent.atomic.AtomicInteger;

public class Print implements Runnable{
    private int threadNumber;
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public Print(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        try {
        while(atomicInteger.get() < 9){
            synchronized (atomicInteger){
                if((atomicInteger.get()%3) == this.threadNumber){
                    System.out.println(atomicInteger.getAndIncrement() + " thread " + this.threadNumber);
                    atomicInteger.notifyAll();
                }else {
                        atomicInteger.wait();
                    }
                }
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}