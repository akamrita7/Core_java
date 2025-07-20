package ArrayEasy;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDuplicates(arr);
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static int removeDuplicates(int[] arr) {
        int len = arr.length;
        int ind = 1;
        for (int i = 1; i < len; i++) {
            if(arr[i]!=arr[i-1]){
                arr[ind++] = arr[i];
            }
        }
        return ind;
    }
}
