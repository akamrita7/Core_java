package ArrayEasy;

import java.util.HashMap;

public class SmallestSubarraySumK {
    public static void main(String[] args){
        int arr[] = {-8, -8, -3, 8};
        int n = arr.length;
        int K = 5;
        System.out.println(smallestSubarraySumK(arr, K));
        System.out.println(smallestSubarraySumK(new int[]{2, 4, 6, 10, 2, 1}, 12));
        System.out.println(smallestSubarraySumK(new int[]{2, 4, 6, 10, 2, 1}, 12));
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
}
