package New2026.june;

import java.util.HashMap;
//https://www.geeksforgeeks.org/dsa/maximum-length-substring-having-all-same-characters-after-k-changes/
public class LongestRepeatingCharReplacement {
    public static void main(String[] args) {
        int k = 2;
        String s = "BABABA";
        System.out.println(longestSubstr(s, k));
        k = 4;
        s = "HHHHHH";
        System.out.println(longestSubstr(s, k));
    }
    static int longestSubstr(String s, int k) {
        int n = s.length();
        HashMap<Character, Integer> freq = new HashMap<>();
        int maxFreq = 0;
        int res = 0;
        int l = 0;
        for (int r = 0; r < n; ++r) {
            freq.put(s.charAt(r), freq.getOrDefault(s.charAt(r), 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(s.charAt(r)));
            if (r - l + 1 - maxFreq > k) {
                freq.put(s.charAt(l), freq.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
