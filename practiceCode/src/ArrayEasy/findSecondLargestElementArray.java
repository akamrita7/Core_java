package ArrayEasy;
//https://www.geeksforgeeks.org/dsa/find-second-largest-element-array/
public class findSecondLargestElementArray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }

    private static int getSecondLargest(int[] arr) {
        int large = -1 , second = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>large){
                second = large;
                large = arr[i];
            } else if (arr[i]>second && arr[i]<large) {
               second = arr[i];
            }

        }
        return second;
    }
}
