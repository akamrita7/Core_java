package leetcode;

public class SmallestSubWithSum {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,1,1,1};
        int x = 5;
//        int[] arr = {2,3,1,2,4,3};
//        int x = 7;
        System.out.println(smallestSubWithSum(x, arr));
    }
    static int smallestSubWithSum(int x, int[] arr) {
        int i = 0, j = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while (j < arr.length) {
            while (j < arr.length && sum <= x) {
                sum += arr[j++];
            }
            if (j == arr.length && sum <= x){
                if( sum == x) {
                    return j-i;
                }
                break;
            }
            while (i < j && sum - arr[i] >= x) {
                sum -= arr[i++];
            }
            ans = Math.min(ans, j - i);
            sum -= arr[i];
            i++;
        }
        if (ans == Integer.MAX_VALUE) return 0;
        return ans;
    }
}
