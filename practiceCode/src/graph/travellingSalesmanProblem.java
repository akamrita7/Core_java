package graph;

import java.util.Arrays;
//https://www.geeksforgeeks.org/dsa/travelling-salesman-problem-using-dynamic-programming/
public class travellingSalesmanProblem {
    static int dfs(int[][] cost, boolean[] vis, int last, int cnt) {
        int n = cost.length;
        if (cnt == n)
            return cost[last][0];
        int minCost = (int)1e9;
        for (int city = 1; city < n; city++) {
            if (!vis[city]) {
                vis[city] = true;
                minCost = Math.min(minCost, cost[last][city]+
                        dfs(cost, vis, city, cnt + 1));
                vis[city] = false;
            }
        }
        return minCost;
    }

    static int tsp(int[][] cost) {
        int n = cost.length;
        boolean[] vis = new boolean[n];
        vis[0] = true;
        return dfs(cost, vis, 0, 1);
    }

    public static void main(String[] args) {
        int[][] cost = {{0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}};
//        int res = tsp(cost);
//        System.out.println(res);
        int res = tspdp(cost);
        System.out.println(res);
    }
    //dp
    static int totalCost(int mask, int curr, int[][] cost, int[][] dp) {
        int n = cost.length;
        if (mask == (1 << n) - 1) {
            return cost[curr][0];
        }
        if (dp[curr][mask] != -1) {
            return dp[curr][mask];
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if ((mask & (1 << i)) == 0) {
                ans = Math.min(ans, cost[curr][i]
                        + totalCost(mask | (1 << i), i, cost, dp));
            }
        }
        return dp[curr][mask] = ans;
    }

    static int tspdp(int[][] cost) {
        int n = cost.length;
        int[][] dp = new int[n][1 << n];
        int mask = 1, curr = 0;
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return totalCost(mask, curr, cost, dp);
    }
}
