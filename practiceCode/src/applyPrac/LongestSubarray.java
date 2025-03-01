package applyPrac;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10} ; int k = 15; //6
//        int[] arr = {-5, 8, -14, 2, 4, 12} ; int k = -5; //5
//        int[] arr = {1, 2, -3, 3, -1, -1} ; int k = 0;
        System.out.println(longestSubarray1(arr, k));
    }

    private static int longestSubarray1(int[] arr, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int res = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == k) {
                res = i+1;
            }else if(mp.containsKey(sum - k)) {
                res = Math.max(res, i - mp.get(sum-k));
            }else{
                mp.put(sum,i);
            }

        }
        return res;
    }

    private static int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;
        int prefSum = 0;
        for (int i = 0; i < arr.length; ++i) {
            prefSum += arr[i];
            // Check if the entire prefix sums to k
            if (prefSum == k)
                res = i + 1;
                // If prefixSum - k exists in the map then there exist such
                // subarray from (index of previous prefix + 1) to i.
            else if (mp.containsKey(prefSum - k))
                res = Math.max(res, i - mp.get(prefSum - k));
            // Store only first occurrence index of prefSum
            if (!mp.containsKey(prefSum))
                mp.put(prefSum, i);
        }

        return res;
    }
}
