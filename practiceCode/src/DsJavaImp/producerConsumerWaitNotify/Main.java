package DsJavaImp.producerConsumerWaitNotify;

public class Main {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5);

        new Thread(new Producer(buffer)).start();
        new Thread(new Consumer(buffer)).start();
    }
}

