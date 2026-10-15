package general2026;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumTriplets {
    public static void main(String[] args) {
//        numTriplets(new int[]{7,4}, new int[]{5,2,8,9}); //2
        numTriplets(new int[]{1,1}, new int[]{1,1,1}); //2
    }

    private static void numTriplets(int[] nums1, int[] nums2) {
        Map<Integer,Integer> pro = new HashMap<>();
        int dup = 1;
        for (int i = 0; i < nums1.length; i++) {
            int prod = nums1[i]*nums1[i];
            if(pro.containsValue(prod)){
                dup++;
            }else {
                pro.put(i, prod);
            }
        }
        int count = 0;
        int k =0;
        while(k<dup){
            for (int i = 0; i < nums2.length - 1; i++) {
                for (int j = 1; j < nums2.length; j++) {
                    int sum = nums2[i] * nums2[j];
                    if (pro.containsValue(sum)) {
                        count++;
                    }
                }
            }
            k++;
        }
        System.out.println(count);
    }

}
