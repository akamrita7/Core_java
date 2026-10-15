package New2026.java8.program;
/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position ofa given target value.
If target is not found in the array, return [-1,-1].

        You must write an algorithm with O(log n) runtime complexity.

        Example 1:Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4]
        Example 2:Input: nums = [5,7,7,8,8,10], target = 6 Output: [-1,-1]
        Example 3:Input: nums = [], target = 0 Output: [-1,-1]*/


public  class int10 {
    public static void main(String[] args){
        Integer[] nums = {5,7,7,8,8,10};
        int target = 8;
        getStartingAndEndTarget(nums,target);
    }

    private static void getStartingAndEndTarget(Integer[] nums, Integer target) {
        int len = nums.length-1;
        int i = 0;
        if(len<=0){
            System.out.println("Not found");
        }
//        int half = len/2;
        int index1 = -1 , index2 = -1;
        Boolean flag = true;
        while(i<len && flag){
           if(nums[i] == target){
               index1 = i;
               while(nums[i]<target){
                   i++;
               }
               index2 = i-1;
               flag = false;
           }else if(nums[len] == target){
               index1 = len;
               while(nums[len]>target){
                   len--;
               }
               index2 = len+1;
               flag = false;
            }else{
               i++;
               len--;

           }
        }
        System.out.println("star index" + index1 + "end index" + index2);
    }

}
