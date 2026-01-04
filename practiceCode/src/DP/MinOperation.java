package DP;
//https://www.geeksforgeeks.org/dsa/minimize-steps-to-reach-k-from-0-by-adding-1-or-doubling-at-each-step/
public class MinOperation {
    public static void main (String []args)
    {
        System.out.print(5== minOperations(12));
    }
    static int minOperations(int k)
    {
        int[] dp = new int[k+1];
        for(int i = 1; i <= k; i++)
        {
            dp[i] = dp[i - 1] + 1;

            // For all even numbers
            if (i % 2 == 0)
            {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
        }
        return dp[k];
    }

}



















/*Given a positive integer K, the task is to find the minimum number of operations of the following two types, required to change 0 to K.
Add one to the operand
Multiply the operand by 2.
Examples:
Input: K = 1
Output: 1
Explanation:
Step 1: 0 + 1 = 1 = K
Input: K = 4
Output: 3
Explanation:
Step 1: 0 + 1 = 1,
Step 2: 1 * 2 = 2,
Step 3: 2 * 2 = 4 = K
Uses dynamic programming to solve this problem. In this case, the subproblems are the minimum number of operations required to reach each number from 1 to k.

Initializes an array dp[] of size k+1 to store the minimum number of operations required to reach each number from 1 to k. Iterates through the numbers from 1 to k, and for each number i, it considers two options:

Adding 1 to the previous number i-1. This is represented by dp[i] = dp[i-1] + 1.
Doubling the previous even number i/2. This is represented by dp[i] = min(dp[i], dp[i/2] + 1).
The first option is straightforward. To reach number i, you can simply add 1 to the previous number i-1. The second option, if i is even, you can reach it by doubling the previous even number i/2. This is because doubling an even number always results in an even number.

By considering both options for each number, we'll ensures that it finds the minimum number of operations required to reach k. The final result is stored in dp[k], which represents the minimum number of operations needed to reach k from 1.

Step-by-step approach:

Initialize a vector dp of size k + 1 to store the minimum operations for each number from 0 to k.
Initialize dp[0] to 0, as the minimum operations required to reach 0 from 0 is 0.
Loop through numbers from 1 to k:
For each number i, set dp[i] to dp[i - 1] + 1, which represents adding 1 to the minimum operations required to reach i - 1.
Check if i is even:
If it is even, update dp[i] to the minimum of its current value and dp[i / 2] + 1. This represents the minimum operations required to reach i by halving i.
Return dp[k], which represents the minimum operations required to reach k.
Below is the implementation of the above approach: */
