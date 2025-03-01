package leetcode;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
//        String s = "  hello world  ";
//        String s = "the sky is blue";
//        String s = "  hello world  ";
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }


    private static String reverseWords(String s) {
        String[] str = s.split(" ");
        int len = str.length-1;
        StringBuilder sb = new StringBuilder();
        while(len >= 0){
            String  c = str[len];
            sb.append(c);
            if(c.length()-1>0){
                sb.append(" ");
            }
            len--;
        }
        return sb.toString().trim();
    }
}
