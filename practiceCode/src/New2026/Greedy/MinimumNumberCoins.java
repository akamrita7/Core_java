package New2026.Greedy;
//https://www.geeksforgeeks.org/dsa/greedy-algorithm-to-find-minimum-number-of-coins/
public class MinimumNumberCoins {
    public static void main(String[] args) {
        int n = 39;
        System.out.println(findMin(n));
    }
    private static int findMin(int n) {
        int count = 0;
        int[] denomination = {1, 2, 5, 10};
        for (int i = denomination.length -1; i >= 0 ; i--) {
            count += n/denomination[i];
            n = n%denomination[i];
        }
        return count;
    }
}
