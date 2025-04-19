package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","floght"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        int len = Math.min(first.length(),last.length());
        int i = 0;
        while( i < len &&  first.charAt(i) == last.charAt(i)){
            i++;
        }
        return first.substring(0,i);
    }
}
