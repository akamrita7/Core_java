package applyPrac;

import java.util.Arrays;

public class ProductArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int[] res = productExceptSelf(arr);

        for (int val : res)
            System.out.print(val + " ");
    }

    private static int[] productExceptSelf(int[] arr) {
        int pro = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                pro *=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                arr[i] = pro;
            }else{
                arr[i] = pro/arr[i];
            }
        }
        return arr;
    }
}
