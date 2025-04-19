package MediumProblemsArray;
//https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
public class SortSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key1 = 3;
        System.out.println(search(arr1, key1));
    }

    private static int  search(int[] arr1, int key1) {
        int low = 0 , high = arr1.length-1 , mid =0 ;
        while (low<=high){
            mid = low + (high-low)/2;
            if(arr1[mid] == key1){
                return mid;
            }
            if(arr1[mid]>=arr1[low]){
                if(key1 >= arr1[low] && key1 < arr1[mid]){
                    high = mid-1;
                }else{
                    low = mid +1;
                }

            }else{
                if(key1>arr1[mid] && key1 <= arr1[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }

            }

        }
        return -1;
    }
}
