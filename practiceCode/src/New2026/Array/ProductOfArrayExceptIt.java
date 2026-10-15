package New2026.Array;
//https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrayExceptIt {
    public static void main(String[] args)
    {
        int arr[] = { 10, 3, 5, 6, 2 };
        int n = arr.length;
        System.out.println("The product array is : ");
        //productArray(arr, n);
        productArray2(arr, n);
    }

    private static void productArray2(int[] arr, int n) {
        int prod = 1;
        for (int i = 0; i < n; i++) {
            prod *= arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(prod/arr[i]);
        }
    }

    private static void productArray(int[] arr, int n) {
        int j = 0;
        while(j<=arr.length-1) {
            int prod = 1;
            for (int i = 0; i <= arr.length-1; i++) {
                if (i != j) {
                    prod *= arr[i];
                }
            }
            j++;
            System.out.println(prod);
        }
    }
}
