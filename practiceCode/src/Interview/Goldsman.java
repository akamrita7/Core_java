package Interview;

/* Problem Name is &&& Count Length Of Cycle &&& PLEASE DO NOT REMOVE THIS LINE. */

/**
 * Instructions to candidate.
 * 1) Run this code in the REPL to observe its behaviour. The
 *    execution entry point is main().
 * 2) Consider adding some additional tests in doTestsPass().
 * 3) Implement countLengthOfCycle() correctly.
 * 4) If time permits, try to improve your implementation.
 */

import java.util.Map;
import java.util.HashMap;

public class Goldsman {

    /**
     * countLengthOfCycle(arr, startIndex)
     *
     * You are given an integer array of size N.
     * Every element of the array is greater than or equal to 0.
     * Starting from arr[startIndex], follow each element to the index it points to.
     * Continue to do this until you find a cycle.
     * Return the length of the cycle. If no cycle is found return -1
     *
     * Examples:
     * countLengthOfCycle([1, 0], 0) == 2
     * countLengthOfCycle([1, 2, 0], 2) == 3
     */
    public static int countLengthOfCycle( int[] arr, int startIndex ) {
        //TODO: Implement solution
        int count = 1;
        int i = startIndex;
        Boolean flag = true;
        while(count < arr.length && startIndex != arr[i]){
            count++;
            if(i>=arr.length-1){
                    i=0;
            }
            i++;
        }
        if(count>1 && count < arr.length ){
            return count;
        }

        return -1;
    }

    /**
     * boolean doTestsPass()
     * Returns true if all the tests pass. Otherwise returns false.
     */
    public static boolean doTestsPass() {
        // TODO: implement some tests, please
        // we've included a trivial boilerplate

        boolean testsPassed = true;

        testsPassed &= countLengthOfCycle(new int[]{1, 0}, 0) == 2;
        testsPassed &= countLengthOfCycle(new int[]{1, 2, 0}, 0) == 3;
        testsPassed &= countLengthOfCycle(new int[]{1, 1}, 0) == 1;
        testsPassed &= countLengthOfCycle(new int[]{1, 3, 0, 1}, 0) == 2;
        testsPassed &= countLengthOfCycle(new int[]{7}, 0) == -1;
        testsPassed &= countLengthOfCycle(new int[]{1, 2, 4}, 0) == -1;

        if(testsPassed) {
            System.out.println( "Test passed." );
            return true;
        } else {
            System.out.println( "Test failed." );
            return false;
        }
    }

    public static void main( String[] args ) {
        doTestsPass();
    }
}

