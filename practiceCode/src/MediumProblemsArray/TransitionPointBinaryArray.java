package MediumProblemsArray;
//https://www.geeksforgeeks.org/dsa/find-transition-point-binary-array/
public class TransitionPointBinaryArray {
    public static void main(String args[])
    {
        int arr[] = { 0, 0, 0, 0, 1, 1 };
        System.out.println(transitionPoint(arr));
    }

    private static int transitionPoint(int[] arr) {
        int left = 0;
        int right = arr.length -1;
        int mid;
        while (left <= right){
           mid = (left + right)/2;
           if(arr[mid]==0){
               left = mid  +1;
           } else if (arr[mid] ==1) {
               if(mid == 0 || (arr[mid-1] == 0)){
                    return mid;
               }
               right = mid-1;
           }
        }
        return -1;
    }
}
