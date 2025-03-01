package leetcode;

import java.util.Arrays;

public class ValidPalidrome {
    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
//        String s = "ab_a";
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        if(s.length()==1){
            return true;
        }
        s = s.toLowerCase().replaceAll("[^a-z\\d]", "");
        int start = 0;
        int end = s.length()-1;
        Boolean flag = true;
        if(end<=0) {
            return false;
        }
        while (start<end){
          if(s.charAt(start) != s.charAt(end)) {
              flag = false;
          }
          start++;
          end--;
        }
        return flag;
    }
}
