package New2026.thread_packgae;

public class ComsumerProducer {
    public static void main(String[] args) throws InterruptedException{
        final PC pc = new PC();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.comsume();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }



            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}

