package New2026.ArrayIDeserve;

import java.util.Arrays;

/*Write a java program to find the max profit based on the given prices and the given Money. For this example, the best buy price should be 8 and sell price should be 155
Money  = 20;
Prices = [23, 230, 16, 24, 35, 80, 70, 18, 29, 150, 8, 155, 17];*/
public class MaxProfitCalculator {
    public static void main(String[] args) {
        int[] prices = {23, 230, 16, 24, 35, 80, 70, 18, 29, 150, 8, 155, 17};
        int money = 20;
        int maxProfit = calculateMaxProfit1(prices, money);
        System.out.println("Maximum Profit: " + maxProfit); // Output: 147
    }

    public static int calculateMaxProfit(int[] prices, int budget) {
        int minBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            // Update min price if current price is lower and within budget
            if (price < minBuyPrice && price <= budget) {
                minBuyPrice = price;
            } else if (price - minBuyPrice > maxProfit) {
                // Calculate profit if selling at current price
                maxProfit = price - minBuyPrice;
            }
        }
        return maxProfit;
    }
    public static int calculateMaxProfit1(int[] prices, int budget) {
        int minBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price <= budget) {
                minBuyPrice = Math.min(price,minBuyPrice);
            }
            maxProfit = Math.max(price - minBuyPrice,maxProfit);
        }
        System.out.println("minBuyPrice = " + minBuyPrice + ", maxProfit = " + maxProfit);
        return maxProfit;
    }
}
