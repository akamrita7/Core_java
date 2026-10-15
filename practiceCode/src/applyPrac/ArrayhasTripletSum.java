package applyPrac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayhasTripletSum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 }; //13 = 1 4 8
        int target = 13;
        if (hasTripletSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
    static boolean hasTripletSum1(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        // Fix the first element as arr[i]
        for (int i = 0; i < n - 2; i++) {
            // Initialize left and right pointers with
            // start and end of remaining subarray
            int l = i + 1, r = n - 1;
            int requiredSum = target - arr[i];
            while (l < r) {
                if (arr[l] + arr[r] == requiredSum)
                    return true;
                if (arr[l] + arr[r] < requiredSum)
                    l++;
                else if (arr[l] + arr[r] > requiredSum)
                    r--;
            }
        }
        return false;
    }


    private static boolean hasTripletSum(int[] arr, int target) {
        int len = arr.length; // { 1, 4, 45, 6, 10, 8 }; 13
        for (int i = 0; i < len-1; i++) {
            Set<Integer> st = new HashSet<>();
            for (int j = i+1; j < len; j++) {
                int second = target - arr[j]-arr[i];
                if(st.contains(second)){
                    return true;
                }
                st.add(arr[j]);
            }
        }
        return false;
    }
}
