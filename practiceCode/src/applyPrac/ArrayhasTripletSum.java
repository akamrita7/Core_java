package applyPrac;

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

    private static boolean hasTripletSum(int[] arr, int target) {
        int len = arr.length;
        for (int i = 0; i < len-2; i++) {
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
