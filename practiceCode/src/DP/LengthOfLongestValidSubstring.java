package DP;
//https://www.geeksforgeeks.org/dsa/length-of-the-longest-valid-substring/
public class LengthOfLongestValidSubstring {
    static int maxLength(String s) {
        int n = s.length();
        int[] dp = new int[n];
        int maxLen = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    if (i >= 2) {
                        dp[i] = dp[i - 2] + 2;
                    }
                    else {
                        dp[i] = 2;
                    }
                }
                else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    if (i - dp[i - 1] >= 2) {
                        dp[i] = dp[i - 1] + dp[i - dp[i - 1] - 2] + 2;
                    }
                    else {
                        dp[i] = dp[i - 1] + 2;
                    }
                }
                maxLen = Math.max(maxLen, dp[i]);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "(()())";
        System.out.println(maxLength1(s));
    }
    static int maxLength1(String s) {
        int maxLen = 0;
        int open = 0, close = 0;
        for (int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);
            if (ch == '(') {
                open++;
            } else if (ch == ')') {
                close++;
            }
            if (open == close) {
                maxLen = Math.max(maxLen, 2 * close);
            } else if (close > open) {
                open = close = 0;
            }
        }
        open = close = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                open++;
            } else if (s.charAt(i) == ')') {
                close++;
            }
            if (open == close) {
                maxLen = Math.max(maxLen, 2 * open);
            } else if (open > close) {
                open = close = 0;
            }
        }
        return maxLen;
    }

}
