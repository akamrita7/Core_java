package applyPrac;

import java.util.Arrays;

//https://www.geeksforgeeks.org/check-if-an-array-can-be-divided-into-pairs-whose-sum-is-divisible-by-k/
//We can divide the array into (92, 48), (75, 65) and (45, 35). The sum of all these pairs are multiples of 10.
public class CanPairsToSumK {
    public static void main(String[] args) {
            int[] arr = {92, 75, 65, 48, 45, 35 };
            int k = 10;
            System.out.println(canPairs1(arr, k) ? "True" : "False");
    }

    private static boolean canPairs(int[] arr, int k) {
        int len = arr.length;
        if(len%2==1) return false;
        int count = 0;
        boolean[] vis = new boolean[len];
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if((arr[i]+arr[j])%k== 0  && !vis[i] && !vis[j] ){
                    System.out.println("Pairs of " + arr[i] + " " +arr[j]);
                    count++;
                    vis[i] = true;
                    vis[j] = true;
                }
            }
        }
        System.out.println(count);
        return count==len/2;
    }

    public static boolean canPairs1(int[] arr, int k) {
        if (arr.length % 2 != 0)
            return false;
        // Create a frequency array of size k
        int[] freq = new int[k];
        for (int x : arr) {
            int rem = x % k;
            // If the complement of the current
            // remainder exists in freq, decrement
            // its count
            if (freq[(k - rem) % k] != 0)
                freq[(k - rem) % k]--;
                // Otherwise, increment the count of
                // the current remainder
            else
                freq[rem]++;
        }
        // Check if all elements in the frequency
        // array are 0
        for (int count : freq) {
            if (count != 0)
                return false;
        }

        return true;
    }
}
