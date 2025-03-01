package leetcode;

import java.util.Arrays;

public class Subsequence {
    public static void main(String[] args) {
        String s = "b";
        String t = "abc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        int lent = t.length();
        int lens = s.length();
        int i = 0 ; int j = 0;
        if(lent <=0 || lens<= 0) return false;
        while(i<lens && j < lent){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        if(i== lens){
            return true;
        }
        return false;
    }
}
