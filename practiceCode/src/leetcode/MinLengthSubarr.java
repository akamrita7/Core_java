package leetcode;

public class MinLengthSubarr {
    // Returns the length of the smallest subarray
    // with sum greater than or equal to x
    static int smallestSubWithSum(int x, int[] arr) {
        int i = 0, j = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while (j < arr.length) {
            while (j < arr.length && sum <= x) {
                sum += arr[j++];
            }
            if (j == arr.length && sum <= x) break;
            while (i < j && sum - arr[i] > x) {
                sum -= arr[i++];
            }
            ans = Math.min(ans, j - i);
            sum -= arr[i];
            i++;
        }
        if (ans == Integer.MAX_VALUE) return 0;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 19};
        int x = 51;

        System.out.println(smallestSubWithSum(x, arr));
    }
}
