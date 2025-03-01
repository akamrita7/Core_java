package leetcode;

public class SmallestSubWithSum1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 19};
        int x = 51;
        System.out.println(smallestSubWithSum(x, arr));
    }

    private static int smallestSubWithSum(int x, int[] arr) {
        int i = 0; int j = 0, sum = 0 ;
        int ans = Integer.MAX_VALUE;
        while (j < arr.length){
            while ( j< arr.length && sum <= x){
                sum += arr[j++];
            }
            if(j == arr.length && sum <= x) break;
            while ( i <j && sum - arr[i] > x){
                sum -=  arr[i++];
            }
            ans = Math.min(ans, j-i);
            sum -= arr[i];
            i++;
        }
        return  (ans == Integer.MAX_VALUE) ?  0 : ans;
    }
}
