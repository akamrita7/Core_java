package applyPrac;

import java.util.HashMap;

public class longSubEqual01 {
    public static void main(String[] args) {
        int[] arr = /*{0, 0, 1, 1, 0};*/ {1, 0, 0, 1, 0, 1, 1};
// subarray where count of 0 equal to 1
//        System.out.println(maxLen(new int[]{0, 0, 1, 1, 0}));
        System.out.println(maxLen(new int[]{1, 0, 0, 1, 0, 1, 1}));
    }

    private static int maxLen(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int preSum = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i]==0?-1:1;
            if(preSum==0)
                res = i+1;
            if(mp.containsKey(preSum)){
                res = Math.max(res, i- mp.get(preSum));
            }
            mp.put(preSum,i);

        }
        return res;
    }
}
