package leetcode;

import java.util.Arrays;
import java.util.HashSet;
//https://www.geeksforgeeks.org/dsa/check-if-pair-with-given-sum-exists-in-array/
public class TwoSum {
    public static void main(String[] args) {
//        int[] numbers = {2,7,11,15}; int target = 9;
//        int[] numbers = {2,3,4}; int target = 6;
        int[] numbers = {2,7,11,15}; int target = 9;
        int[] result = twoSum(numbers,target);
        System.out.println("args = " + Arrays.toString(result));
        System.out.println(twoSum2(new int[]{0, -1, 2, -3, 1}, -2));//true
    }
    //Sorting and Two-Pointer Technique - O(n × log(n)) time and O(1) space
    public static int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int last = numbers.length-1;
        int sum ;
        int[] res = new int[2];
        while (first<last){
            sum = numbers[first]+numbers[last];
            if(sum==target){
               res[0] = first;
               res[1] = last;
               return res;
            } else if ( sum > target) {
                last--;
            }else{
                first++;
            }
        }
        return res;
    }
    //Using Hash Set - O(n) time and O(n) space
    static boolean twoSum2(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (set.contains(complement)) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
