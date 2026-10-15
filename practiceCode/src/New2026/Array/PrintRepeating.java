package New2026.Array;

public class PrintRepeating {
    public static void main(String[] args)
    {
        int arr[] = {4, 2, 4, 5, 2, 3, 1 , 5};
        int arr_size = arr.length;
        printRepeating(arr, arr_size);
    }

    private static void printRepeating(int[] arr, int size) {
        int[] count = new int[size];
        for(int i = 0 ; i < size ; i++){
            if(count[arr[i]] == 1){
                System.out.println(arr[i]);
            }else{
                count[arr[i]]++;
            }
        }
    }
}
