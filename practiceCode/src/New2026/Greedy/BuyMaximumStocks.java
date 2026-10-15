package New2026.Greedy;

import java.util.Arrays;
import java.util.Comparator;
//https://www.geeksforgeeks.org/dsa/buy-maximum-stocks-stocks-can-bought-th-day/
public class BuyMaximumStocks {
    public static void main(String[] args)
    {
        int[] price = { 10, 7, 19 };
        int K = 45;

        // int []price = { 7, 10, 4 };
        // int K = 100;
        System.out.println(buyMaximumProducts(price, K, price.length));
        System.out.println(buyMaximumProducts(new int[]{7, 10, 4}, 100, 3));
    }

    private static int buyMaximumProducts(int[] price, int K, int n) {
        Pairs[] arr = new Pairs[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Pairs(price[i],i+1);
        }
        Arrays.sort(arr, Comparator.comparing(Pairs::getFirst));
        int ans = 0 ;
        for (int i = 0; i < n; i++) {
            ans += Math.min(arr[i].second,
                    K / arr[i].first);
            K -= arr[i].first
                    * Math.min(arr[i].second,
                    K / arr[i].first);
        }
        return ans;
    }
}

class Pairs{
    int first , second;

    public Pairs(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}
