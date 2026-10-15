package prgram2026.threadproblem;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
//https://www.geeksforgeeks.org/java/difference-between-fork-join-framework-and-executorservice-in-java/
public class ForkjoinQ extends RecursiveTask<Integer> {
    int array[];
    int start, end;
    int searchElement;

    public ForkjoinQ(int[] array, int start, int end, int searchElement) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.searchElement = searchElement;
    }

    @Override
    protected Integer compute() {
        return processSearch();
    }

    private Integer processSearch() {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (array[i] == searchElement) {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        int array[] = { 1, 2, 6, 3,  4,  5,  6, 7, 8, 9, 10, 11, 12, 6 };
        int searchElement = 6;
        int start = 0;
        int end = array.length - 1;
        ForkJoinPool pool = ForkJoinPool.commonPool();
        ForkjoinQ task = new ForkjoinQ(array, start, end, searchElement);
        int result = pool.invoke(task);
        System.out.println(searchElement + " found " + result + " times ");
    }
}

/*        The Fork/Join framework provides fine-grained task execution framework with high performance for Java data parallelism. Its parallel computing engine is used by many higher-level frameworks. The fork/join framework supports a style of parallel programming that solves problems by "Divide and conquer”, in the following manner as shown below:

        Splitting a task into sub-tasks.
        Solving sub-tasks in parallel
        Sub-tasks can run in parallel on different cores.
        Sub-tasks can also run concurrently in different threads on a single core.
        Waiting for them to complete
join() waits for a sub-task to finish
        Merging the results.
        A task uses calls to join() to merge the sub-task results together.*/
