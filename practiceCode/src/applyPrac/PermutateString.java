package applyPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutateString {
    static void recurPermute(int index, StringBuilder s,
                             List<String> ans) {
        if (index == s.length()) {
            ans.add(s.toString());
            return;
        }
        for (int i = index; i < s.length(); i++) {
            swap(s, index, i);
            recurPermute(index + 1, s, ans);
            swap(s, index, i);
        }
    }
    static void swap(StringBuilder s, int i, int j) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }
    static List<String> findPermutation(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder(s);
        recurPermute(0, str, ans);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        String s = "ABCD";
//        List<String> res = findPermutation(s);
        /*for (String x : res) {
            System.out.print(x + " ");
        }*/
         permutation("",s);

    }
    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}
