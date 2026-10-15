package leetcode;
//https://www.geeksforgeeks.org/dsa/trapping-rain-water/
public class TrappingRainWater {
    public static void main(String[] args) {
        //        int[] arr = {2, 1, 8, 6, 4, 6, 5, 5};
//        int[] arr = {1,8,6,2,5,4,8,3,7};
        int[] arr = {2, 1, 5, 3, 1, 0, 4};
        System.out.println(maxWater1(arr));
    }
    private static int maxWater1(int[] arr) {
        int left = 1 ,right = arr.length-2;
        int lMax = arr[left - 1];
        int rMax = arr[right + 1];
        int result =0;
        while (left<=right){
            if(lMax<=rMax){
                result += Math.max(0, lMax - arr[left]); //{2, 1, 5, 3, 1, 0, 4};
                lMax = Math.max(arr[left],lMax );
                left++;
            }else {
                result += Math.max(0, rMax - arr[right]);
                rMax = Math.max(arr[right],rMax );
                right--;
            }
        }
        return result;
    }
}
