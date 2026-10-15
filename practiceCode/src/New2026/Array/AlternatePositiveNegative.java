package New2026.Array;

import java.util.Arrays;

public class AlternatePositiveNegative {
    public static void main(String[] args)
    {
        int arr[] = { 2, 3, -4, -1, 6, -9 };
        int n = arr.length;
        rearrange(arr, n);
        Arrays.stream(arr).forEach(x -> {
            System.out.print(x + " ");
        });
    }

    private static void rearrange(int[] arr, int n) {
        int i =0 , j = n-1;
        while (i<j) {
            while (i < n - 1 && arr[i] > 0)
                i += 1;
            while ((j >= 0 && arr[j] < 0))
                j -= 1;
            if (i < j) {
                swap(arr, i, j);
            }
        }

            if( i ==0 || i==n){
                return;
            }
            int k = 0;
            while (k<n && i<n){
                swap(arr,k , i);
                i = i+1;
                k = k+2;

            }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
