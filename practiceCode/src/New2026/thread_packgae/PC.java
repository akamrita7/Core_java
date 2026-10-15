package New2026.thread_packgae;

import java.util.LinkedList;

public  class PC{
    Boolean flag = true;
    LinkedList<Integer> list = new LinkedList<>();
    int size = 2;

    public void produce() throws InterruptedException {
        int value = 0;
        Thread.sleep(500);
         while (flag) {
        synchronized (this) {
            while (list.size() == size) wait();
            System.out.println("Producer produced-" + value);
            list.add(value++);
            notifyAll();
            Thread.sleep(1000);
               }

        }
    }

    public void comsume() throws InterruptedException{
        Thread.sleep(500);
        while (flag){
        synchronized(this){
            while (list.size()==0)wait();
            int val = list.remove();
            System.out.println("Consumer consumed-" + val);
            notify();
            Thread.sleep(1000);
            if(val>10){
                flag = false;
            }


        }
        }

    }
}
