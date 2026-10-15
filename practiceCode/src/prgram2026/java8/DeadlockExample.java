package prgram2026.java8;

import java.util.Arrays;

public class DeadlockExample {
    public static void main(String[] args) {
        final String resource1 = "resource1";
        final String resource2 = "resource2";
        Thread t1 = new Thread(() -> {
            synchronized (resource1){
                System.out.println(("Thread 1: Locked resource 1"));
                try {
                    Thread.sleep(500);
                }catch (Exception e){

                }
            }
            synchronized (resource2){
                System.out.println(("Thread 1: Locked resource 1"));

            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (resource2){
                System.out.println(("Thread 2: Locked resource 1"));
                try {
                    Thread.sleep(500);
                }catch (Exception e){

                }
            }
            synchronized (resource1){
                System.out.println(("Thread 2: Locked resource 1"));

            }
        });
        t1.start();
        t2.start();
    }

}
