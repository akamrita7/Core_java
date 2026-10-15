package DsJavaImp.producerConsumerBlockinQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        //LinkedBlockingQueue , PriorityBlockingQueue others are also there
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }
}