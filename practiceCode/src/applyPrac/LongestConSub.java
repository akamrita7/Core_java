package applyPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

//https://www.geeksforgeeks.org/longest-consecutive-subsequence/
public class LongestConSub {
    public static void main(String[] args) {
            int[] arr =  { 2, 6, 1, 9, 4, 5, 3 }; //{ 2, 6, 1, 9, 4, 5, 3 ,8 , 10};
            System.out.println(longestConsecutive(arr));
//            System.out.println(longestConsecutive(new int[]{ 2, 6, 1, 9, 4, 5, 3 ,8 , 10}));
//            System.out.println(longestConsecutive(new int[]{ 36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}));
    }
    static int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int res = 1, cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                continue;
            if (arr[i] == arr[i - 1] + 1) {
                cnt++;
            } else {
                cnt = 1;
            }
            res = Math.max(res, cnt);
        }
        return res;
    }

    private static int longestConsecutive1(int[] arr) {
        int len = arr.length;
        List<Integer> ar = Arrays.stream(arr).boxed().toList();
      /*return (int) IntStream.range(1,len).boxed().
                filter(x -> ar.contains(x)).count();*/
        int count = 1;
        while (ar.contains(count)){
            count++;
        }
        return count-1;
    }
}
