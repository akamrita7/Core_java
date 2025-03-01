package leetcode;

import java.util.Arrays;

public class FirstoccurenceInString {
    public static void main(String[] args) {
        String haystack = "butsad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));;

    }
    public static int strStr(String haystack, String needle) {
        int len = haystack.length();
        int lenSub = needle.length();
        int i = 0;
        while(lenSub <= len){
            String sub = haystack.substring(i,lenSub);
            if(sub.equals(needle)){
                System.out.println("args = " + i);
                return i;
            }
            i++;
            lenSub++;
        }
        return -1;
    }
}
