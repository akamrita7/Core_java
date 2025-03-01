package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
//        int[] numbers = {2,7,11,15}; int target = 9;
//        int[] numbers = {2,3,4}; int target = 6;
        int[] numbers = {2,7,11,15}; int target = 9;
        int[] result = twoSum(numbers,target);
        System.out.println("args = " + Arrays.toString(result));
    }
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
}
