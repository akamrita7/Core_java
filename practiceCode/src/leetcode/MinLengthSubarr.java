package leetcode;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MinLengthSubarr {
    // Returns the length of the smallest subarray
    // with sum greater than or equal to x
    static int smallestSubWithSum(int x, int[] arr) {
//        private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//        scheduler.scheduleAtFixedRate(yourRunnable, 8, 8, TimeUnit.HOURS);
        int i = 0, j = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while (j < arr.length) {
            while (j < arr.length && sum <= x) {
                sum += arr[j++];
            }
            if (j == arr.length && sum <= x) break;
            while (i < j && sum - arr[i] > x) {
                sum -= arr[i++];
            }
            ans = Math.min(ans, j - i);
            sum -= arr[i];
            i++;
        }
        if (ans == Integer.MAX_VALUE) return 0;
        return ans;
    }
    private static int smallestSubarraySumK(int[] arr , int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int currPrefixSum = 0;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currPrefixSum +=  arr[i];
            if(currPrefixSum == k){
                int curlen = i+1;
                result = Math.min(result,curlen);
            }
            int requirePrefixSum = currPrefixSum - k;
            if(mp.containsKey(requirePrefixSum)){
                int foundInx = mp.get(requirePrefixSum);
                int currIdx = i;
                result = Math.min(result , currIdx - foundInx);
            }
            mp.put(currPrefixSum,i);
        }
        if(result >= Integer.MAX_VALUE) return -1;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 19};
        int x = 51;

        System.out.println(smallestSubWithSum(x, arr));
//        System.out.println(smallestSubarraySumK(new int[]{2, 4, 6, 10, 2, 1}, 12));
        System.out.println(smallestSubWithSum(12,new int[]{2, 4, 6, 10, 2, 1}));
    }
}
