package New2026.StringEasy;/*

Longest Common Prefix using Character by Character Matching
        Difficulty Level : Easy
        Last Updated : 08 Apr, 2021
        Given a set of strings, find the longest common prefix.


        Input  : {“geeksforgeeks”, “geeks”, “geek”, “geezer”}
        Output : "gee"

        Input  : {"apple", "ape", "april"}
        Output : "ap"
*/

public class longestCommonPrefix {
    public static void main(String[] args)
    {
        String arr[] = {"geeksforgeeks", "geeks",
                "geek", "geezer"};
        int n = arr.length;

        String ans = commonPrefix(arr, n);

        if (ans.length() > 0) {
            System.out.println("The longest common prefix is "
                    + ans);
        } else {
            System.out.println("There is no common prefix");
        }
    }

    private static String commonPrefix(String[] arr, int n) {
        int minLen = getMinLen(arr,n);
        char current; String result = "";
        for (int i = 0;i < minLen ;i++){
            current = arr[0].charAt(i);
            for (int j  =0 ; j< n ;j++){
                if(arr[j].charAt(i) != current){
                  return result;
                }
            }
            result += current;
        }
        return result;
    }

    private static int getMinLen(String[] arr, int n) {
        int min = arr[0].length();
        for(int i = 1; i<n ; i++){
            if(arr[i].length()<min) min = arr[i].length();
        }
        return min;
    }
}
