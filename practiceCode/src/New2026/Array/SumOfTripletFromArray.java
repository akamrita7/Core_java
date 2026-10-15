package New2026.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/
public class SumOfTripletFromArray {
    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 10, 8};
        int arr_size = A.length;

       // find2Numbers(A, arr_size, sum);
//        find3Numbers(A, arr_size, 22);
        find3NumbersEfficient(A, arr_size, 22); //4 and 8 and 10
    }

    private static void find3NumbersEfficient(int[] arr, int arr_size, int sum) {
        Arrays.sort(arr);
        for (int i = 0; i < arr_size-2; i++) {
            int l = i+1;
            int r = arr_size-1;
            while (l<r){
                if(arr[i]+arr[l]+arr[r] == sum){
                    System.out.println(arr[i]+ " and " + arr[l]+ " and " + arr[r]);
                    return;
                }else if(arr[i]+arr[l]+arr[r]<sum){
                    l++;
                }else if(arr[i]+arr[l]+arr[r]>sum){
                  r--;
                }
            }

        }
        System.out.println("No Triplet found");
    }

    private static void find2Numbers(int[] arr, int arr_size, int sum) {
        Set<Integer> arrCopy = new HashSet();
        for (int i = 0; i < arr_size; i++) {
            int cur_sum = sum - arr[i];
            if (arrCopy.contains(cur_sum)) {
                System.out.printf("Number are %d and %d", cur_sum, arr[i]);
            } else {
                arrCopy.add(arr[i]);
            }
        }
    }

    private static void find3Numbers(int[] arr, int arr_size, int sum) {

        for (int i = 0; i < arr_size - 2; i++) {
            Set<Integer> arrCopy = new HashSet();
            int cur_sum = sum - arr[i];
            for (int j = i + 1; j < arr_size; j++) {
                if (arrCopy.contains(cur_sum - arr[j])) {
                    System.out.printf("Number are %d and %d and %d ", cur_sum-arr[j], arr[i], arr[j]);
                } else {
                    arrCopy.add(arr[j]);
                }

            }
        }
    }
}
