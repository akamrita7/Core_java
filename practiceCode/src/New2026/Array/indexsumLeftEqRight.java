package New2026.Array;

/*Return index of an element in array such that sum of left array is equal to sum of right array
        Input: 1 4 6 5
        Output: 2*/

public class indexsumLeftEqRight {
    public static void main(String[] args)
    {
        int arr[] = { 1,2,3,2,4,8};
        indexFromSumLeftEqlRight(arr);

    }

    private static void indexFromSumLeftEqlRight(int[] arr) {
        int i = 0 ;
        int j = arr.length-1;
        int sumLeft = arr[0];
        int sumRight = arr[j];
        while(sumLeft != sumRight ||  (i<j/2)){
            if(sumLeft<sumRight) {
                i++;
                sumLeft += arr[i];
            }else  {
                sumRight += arr[j];
            }
        }
        if(sumLeft == sumRight ){
            System.out.println("index is :" + (i+1));
        }else{
            System.out.println("invalid  :" );
        }
    }
}
