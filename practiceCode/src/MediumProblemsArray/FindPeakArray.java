package MediumProblemsArray;

public class FindPeakArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        System.out.println(peakElement(arr));
    }

    private static int peakElement(int[] arr) {
        int len = arr.length-1;
        if (len ==1)
            return 0;
        if(arr[0]>arr[1])
            return 0;
        if(arr[len-1]>arr[len-2])
            return len-1;
        int low = 1 , high = arr.length -2 , mid = 0;
        while(low <= high){
            mid = low + (high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return mid;
            if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
