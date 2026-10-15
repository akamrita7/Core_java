package New2026.thread_packgae;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFutureUse {
   // private ExecutorService executorService =  Executors.newSingleThreadExecutor();
    private ExecutorService executorService =  Executors.newFixedThreadPool(2);
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorFutureUse sq = new ExecutorFutureUse();
        Future<Integer> future1 = sq.calculate(10);
        Future<Integer> future2 = sq.calculate(20);
        while (!(future1.isDone() && future2.isDone())){
            System.out.println(
                    String.format(
                            "future1 is %s and future2 is %s",
                            future1.isDone() ? "done" : "not done",
                            future2.isDone() ? "done" : "not done"
                    )
            );
            Thread.sleep(300);
        }
        Integer result1 = future1.get();
        Integer result2 = future2.get();
        System.out.println(result1+ " " +result2);
        sq.executorService.shutdown();
    }


    private Future<Integer> calculate(int i) {
        return executorService.submit(()->{
            Thread.sleep(1000);
            return i*i;
        });
    }
}
