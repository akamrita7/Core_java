package general;

import java.util.Arrays;

public class FibonacciSeriesDp {
    public static void main(String[] args) {
//        int res = nthFibonacci(5);
        int res = fibonacci(5);
        System.out.println(res);
    }

    private static int fibonacci(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return fibonaccidp(n, dp);
    }

    private static int fibonaccidp(int n, int[] dp) {
        if(n<=1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = fibonaccidp(n-1 , dp) + fibonaccidp(n-2 , dp);
        return dp[n];
    }
    static int nthFibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }
}
