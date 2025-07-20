package leetcode;
//https://www.geeksforgeeks.org/dsa/length-of-the-longest-substring-without-repeating-characters/
    /*Initialize two pointers left and right with 0, which define the current window being considered.
    The right pointer moves from left to right, extending the current window.
    If the character at right pointer is not visited, it's marked as visited.
    If the character at right pointer is visited, it means there is a repeating character. The left pointer moves to the right while marking visited characters as false until the repeating character is no longer part of the current window.
    The length of the current window (right - left + 1) is calculated and answer is updated accordingly.
    */
public class LongestUniqueSubstr {
    static final int MAX_CHAR = 26;
    static int longestUniqueSubstr(String s) {
        s = s.trim();
        if (s.length() == 0 || s.length() == 1)
            return s.length();
        int res = 0;
        boolean[] vis = new boolean[MAX_CHAR];
        int left = 0, right = 0;
        while (right < s.length()) {
            while (vis[s.charAt(right) - 'a'] == true) {
                vis[s.charAt(left) - 'a'] = false;
                left++;
            }
            vis[s.charAt(right) - 'a'] = true;
            res = Math.max(res, (right - left + 1));
            right++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks"; //eksforg 7
        System.out.println(longestUniqueSubstr(s));
    }
}
