package applyPrac;

import java.util.Arrays;

import static java.util.Collections.rotate;
//https://www.geeksforgeeks.org/c-program-cyclically-rotate-array-one/
public class RotateBy1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        rotate(arr);
        rotatebyK(arr,2);
        System.out.println(Arrays.toString(arr)); // [5, 1, 2, 3, 4]
    }

    private static void rotate(int[] arr) {
        int len = arr.length-1;
        int last = arr[len];
        for (int i = len; i >0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;

    }
    private static void rotatebyK(int[] arr,int k) {
        int len = arr.length;
        k = k%len;
        if(k==0) return;
        int last[] = new int[k];
        int j = 0;
        for (int i = len-k; i < len ; i++) {
            last[j++] = arr[i];
        }
        for (int i = len-1; i-k >=0 ; i--) {
            arr[i] = arr[i-k];
        }
        j=0;
        while (j<last.length){
            arr[j] = last[j];
            j++;
        }


    }
}
