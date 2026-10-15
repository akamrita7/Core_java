package New2026.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
//https://www.geeksforgeeks.org/dsa/find-minimum-maximum-amount-buy-n-candies/
/*Given an array prices[] of n different candies, where prices[i] represents the price of the ith candy and all prices are distinct. The store has an offer where for every candy you buy, you can get up to k other different candies for free. Find the minimum and maximum amount of money needed to buy all the candies.
        Note: In both cases, you must take the maximum number of free candies possible during each purchase.

        Examples:

        Input: prices[] = [3, 2, 1, 4], k = 2
        Output: [3, 7]
        Explanation: For minimum cost, buy the candies costing 1 and 2. for maximum cost, buy the candies costing 4 and 3.

        Input: prices[] = [3, 2, 1, 4, 5], k = 4
        Output: [1, 5]
        Explanation: For minimum cost, buy the candy costing 1. for maximum cost, buy the candy costing 5.*/
public class MinMaxBuyCandy {
    public static void main(String[] args) {
        int[] prices = {3, 2, 1, 4};
        int k = 2;
        ArrayList<Integer> res = minMaxCandy(prices, k);
        System.out.println(res.get(0) + " " + res.get(1)); //3 7
        prices = new int[]{3, 2, 1, 4, 5}; k = 4; //Output: [1, 5]
        res = minMaxCandy(prices, k);
        System.out.println(res.get(0) + " " + res.get(1));

    }

    private static ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        Arrays.sort(prices);
        int len = prices.length;
        int minCost = 0 , maxCost = 0;
        int index = -1;
        for (int i = 0; i < len; i++) {
            minCost += prices[i];
            len -=k;
        }
        for (int i = prices.length-1; i > index ; i--) {
            maxCost += prices[i];
            index +=k;
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(minCost);
        res.add(maxCost);
        return res;
    }
}
