package MediumProblemsArray;

public class CountOccerenceSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int target = 2;
        System.out.println(countFreq(arr, target));
    }


    private static int countFreq(int[] arr, int target) {
        int low = 0, high = arr.length -1 , mid = 0;
//        mid = getMid()
        while(low<=high){
            mid = low + (high-low)/2;
            if(arr[mid] == target){
                break;
            } else if (target >= arr[mid]) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        int m = mid ;
        int freq =  0;
        if(mid>0) {
            while (arr[m] == target) {
                freq++;
                m++;
            }
            m = mid-1;
            while (arr[m] == target) {
                freq++;
                m--;
            }
            return freq;
        }
        return -1;
    }
}
