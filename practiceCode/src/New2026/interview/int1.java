package New2026.interview;

/*[8:57 PM] Banerjee, Neelav
        [3,4]
        ​[8:58 PM] Banerjee, Neelav
        [5,7,7,8,8,10]
        ​[8:58 PM] Banerjee, Neelav
        target = 6
        [8:58 PM] Banerjee, Neelav
    Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
​[8:58 PM] Banerjee, Neelav
    Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
*/


import java.util.Arrays;

public class int1 {
    public static void main(String[] args){
        // nums = [5,7,7,8,8,10], target = 8
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        findFirstLastIndex(nums,target);
    }
    private static void findFirstLastIndex(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length-1;
        int mid;
        int last = -1 ;
        int first = -1;
        while(start<end){
            mid = start + (end-start)/2; //==0?end/2:end/2+1;
            if(target<nums[mid]){
                end = mid-1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else if(target == nums[mid]){
                last = mid;
                first = mid;
                while(target == nums[++mid]){
                   last = mid;
                }
                while(target == nums[--mid]){
                    first = mid;
                }
                break;
            }
        }
        System.out.println("Fisrt = " + first + ", last = " + last);

    }


}
