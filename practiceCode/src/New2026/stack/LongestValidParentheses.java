package New2026.stack;

import java.util.Stack;
//https://www.geeksforgeeks.org/dsa/length-of-the-longest-valid-substring/
public class LongestValidParentheses {
    public static void main(String[] args)
    {
        String str = "((()()";
//        System.out.print(findMaxLen(str) +"\n"); //4
//        str = "()(()))))";
        str = "(()())";
        System.out.print(maxLength1(str) +"\n"); //6
    }
    static int maxLength(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            }
            else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - st.peek());
                }
            }
        }
        return maxLen;
    }

    private static int findMaxLen(String s) {
        if (s.length() <= 1)
            return 0;
        // Initialize curMax to zero
        int curMax = 0;
        int[] longest = new int[s.length()];
        for (int i = 1; i < s.length(); i++)
        {
            if (s.charAt(i) == ')' && i - longest[i - 1] - 1 >= 0
                    && s.charAt(i - longest[i - 1] - 1) == '(')
            {
                longest[i]
                        = longest[i - 1] + 2
                        + ((i - longest[i - 1] - 2 >= 0)
                        ? longest[i - longest[i - 1] - 2]
                        : 0);
                curMax = Math.max(longest[i], curMax);
            }
        }
        return curMax;
    }
    static int maxLength1(String s) {
        int n = s.length();
        int[] dp = new int[n];
        int maxLen = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == ')') {
                // Check if the previous character is an
                // opening parenthesis '('
                if (s.charAt(i - 1) == '(') {
                    if (i >= 2) {
                        dp[i] = dp[i - 2] + 2;
                    }
                    else {
                        dp[i] = 2;
                    }
                }
                // Check if the previous character is a
                // closing parenthesis ')' and the matching
                // opening parenthesis exists before the
                // valid substring
                else if (i - dp[i - 1] > 0
                        && s.charAt(i - dp[i - 1] - 1) == '(') {

                    if (i - dp[i - 1] >= 2) {
                        dp[i] = dp[i - 1] + dp[i - dp[i - 1] - 2] + 2;
                    }
                    else {
                        dp[i] = dp[i - 1] + 2;
                    }
                }
                // Update the maximum length
                maxLen = Math.max(maxLen, dp[i]);
            }
        }
        return maxLen;
    }
}
