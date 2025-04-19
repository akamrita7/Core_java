package MediumProblemsArray;

import java.util.TreeSet;
//https://www.geeksforgeeks.org/kth-smallest-largest-element-in-unsorted-array/
public class KSmallestElement {
    // Driver's code:
    public static void main(String[] args) {
        int N = 10;
        int[] arr = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
        int K = 4;
        // Function call
        System.out.println("Kth Smallest Element is: " + kthSmallest(arr, N, K));
    }

    private static int kthSmallest(int[] arr, int n, int k) {
        TreeSet<Integer> small = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            small.add(arr[i]);
            if(small.size()>k){
               small.pollLast();
            }
        }
        return small.pollLast();
    }
}
