package New2026.interview;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;
//https://www.geeksforgeeks.org/dsa/best-time-to-buy-and-sell-stock/
/*You are given an array prices where prices[i] is the price of a given stock on the ith day.
        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.*/

public class StockBuySell implements Serializable {
    private  static StockBuySell obj = null;
    private StockBuySell(){

    }
    public StockBuySell getObj(){
       if(obj == null){
           obj = new StockBuySell();
       }
       return obj;
    }
    //wissen
    public static void main(String[] args){
        Integer[] prices = new Integer[]{1,5,3,6,4,7};
        findMaxProfit(prices);
    }
//optimal solution
    static int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            // Update the minimum value seen so far
            minSoFar = Math.min(minSoFar, prices[i]);
            // Update result if we get more profit
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }

    private static void findMaxProfit(Integer[] str) {
        Set<Integer> count = new TreeSet();
        for(int i = 0; i <str.length-1 ; i++){
            int max = 0;
            for (int j = 1 ; j < str.length ; j++){
                if(str[j]-str[i]>max) max = str[j]-str[i];
            }
           count.add(max) ;
        }
        System.out.println(count.stream().max((o1, o2) -> o1.compareTo(o2)).get());
    }
}
