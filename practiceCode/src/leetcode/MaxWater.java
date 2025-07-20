package leetcode;
//https://leetcode.com/problems/container-with-most-water/description/
//https://www.geeksforgeeks.org/container-with-most-water/
public class MaxWater {
    public static void main(String[] args) {
//        int[] arr = {2, 1, 8, 6, 4, 6, 5, 5};
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxWater(arr));
    }
    static int maxWater(int[] arr) {
        int left = 0, right = arr.length - 1;
        int res = 0;
        while (left < right) {
            //area of rectangle= length*breath
            //finding maximum area
            int water = Math.min(arr[left], arr[right]) * (right - left);
            res = Math.max(res, water);
            if (arr[left] < arr[right])
                left += 1;
            else
                right -= 1;
        }

        return res;
    }

}
