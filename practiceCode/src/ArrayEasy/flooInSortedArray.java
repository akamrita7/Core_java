package ArrayEasy;

public class flooInSortedArray {
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 4, 6, 10, 12, 14 };
        System.out.println(findFloor(arr, -1)); //-1
        System.out.println(findFloor(arr, 7)); //6
    }

    private static int findFloor(int[] arr, int x) {
        int n = arr.length;
        int low = 0 , high = n -1;
        int res = -1;
        while (low<= high){
            int mid = low + (high-low)/2;
            if(arr[mid] <= x){
                res = arr[mid];
                low = mid+1;
            }
            high = mid-1;
        }

        return res;

    }
}
