package New2026.ArrayIDeserve;

public class LastIndexOfElementInSortedIntegerArrayWithDuplicates {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 2, 4, 5, 5, 7, 8};
        int num = 5;
        int index = searchElementAndReturnIndex(array, num);
        System.out.println("Element " + num + (index >= 0 ? (" found at index " + index) : " not found!"));
    }

    private static int searchElementAndReturnIndex(int[] array, int num) {
        if(array == null || array.length == 0){
            return -1;
        }
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if((array[mid] == num) && (mid == end) || (array[mid+1]>num)){
                return mid;
            }else if(num <array[mid]){
                end = mid-1;
            }else{
                start = mid +1;
            }

        }
        return -1;
    }
}
