package leetcode;

import java.util.Arrays;

public class FirstoccurenceInString {
    public static void main(String[] args) {
        String haystack = "butssad";
        String needle = "sad";
        System.out.println(strStr1(haystack,needle));;

    }
    public static int strStr1(String haystack, String needle) {
        int len = haystack.length();
        int lenSub = needle.length();
        int i = 0 ,j = 0, found = -1;
        while (i<len){
            if(haystack.charAt(i) == needle.charAt(j)){
                found = i;
                while (j < lenSub && haystack.charAt(i) == needle.charAt(j)){
                    j++;
                    i++;
                }
                if(j+1==lenSub){
                    return found;
                }else{
                    j=0;
                    i--;
                }
            }
            i++;

        }
        return found;
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
