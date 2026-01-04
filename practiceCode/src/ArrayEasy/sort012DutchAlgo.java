package ArrayEasy;

public class sort012DutchAlgo {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2 };
        int n = arr.length;
        // sort the array in-place
        sort012(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
//https://www.geeksforgeeks.org/dsa/sort-an-array-of-0s-1s-and-2s/
    private static void sort012(int[] arr) {
        int len = arr.length-1;
        int low = 0 , mid = 0 , high = len;
        while(mid<=high){
            if(arr[mid]==0){
                int tem = arr[low];
                arr[low++] = arr[mid];
                arr[mid++] = tem;
            }else if( arr[mid] == 1){
                mid++;
            }else {
                int tem = arr[high];
                arr[high--] = arr[mid];
                arr[mid] = tem;
            }
        }
    }
}
