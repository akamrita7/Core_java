package ArrayEasy;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
    /*To calculate the maximum sum of subarray ending at current element, say maxEnding, we can use the maximum sum ending at the previous element.
    So for any element, we have two choices:
    Choice 1: Extend the maximum sum subarray ending at the previous element by adding the current element to it. If the maximum subarray sum ending at the previous index is positive, then it is always better to extend the subarray.
    Choice 2: Start a new subarray starting from the current element. If the maximum subarray sum ending at the previous index is negative, it is always better to start a new subarray from the current element.
    This means that maxEnding at index i = max(maxEnding at index (i - 1) + arr[i], arr[i]) and the maximum value of maxEnding at any index will be our answer.*/
    private static int maxSubarraySum(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            res = Math.max(res,maxEnding);
        }
      return res;
    }
}
