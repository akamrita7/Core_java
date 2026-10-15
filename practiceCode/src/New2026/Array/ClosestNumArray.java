package New2026.Array;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ClosestNumArray {
    public static void main(String[] args)
    {
       // int arr[] = { 1, 2, 4, 5, 6, 6, 8, 9 };
        int arr[] = { 10, 14, 28, 11, 7, 16, 30, 50, 25};
        Arrays.stream(arr).sum();

        int target = 15;
//        System.out.println(findClosest(arr, target));
        System.out.println(findClosest2(arr, target));
    }

    private static int findClosest2(int[] arr, int target) {
        Map<Integer,Integer> list2 = new TreeMap();
        for (int i = 0; i<arr.length ; i++){
            list2.put(Math.abs(target-arr[i]),arr[i]);
        }
        return list2.entrySet().iterator().next().getValue();
    }

    private static int findClosest(int[] arr, int target) {
        int n = arr.length;
        if(target<=arr[0]){
            return arr[0];
        }
        if (target>=arr[n-1]){
            return arr[n-1];
        }
        int i =0 , j = n-1 , mid = 0;
        while (i<j){
            mid = i+j/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            if(target<arr[mid]){
                if(mid>0 && target > arr[mid-1])
                    return getClosest(arr[mid-1],arr[mid],target);
                j=mid;
            }else{
                if(mid<n-1 && target < arr[mid+1])
                    return getClosest(arr[mid],arr[mid+1],target);
                i = mid+1;
            }
        }
        return arr[mid];
    }

    private static int getClosest(int val1, int val2, int target) {
        if(target-val1>= target-val2)
            return val2;
        else
           return val1;
    }
}
