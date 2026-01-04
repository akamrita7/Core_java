package ArrayEasy;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        /*int newSize = removeDuplicates(arr);
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }*/
        int[] arr1 = {5, 4, 2, 4, 2, 4, 3, 5, 1};
        int newSize1 = removeDuplicatesNotSorted(arr);
        for (int i = 0; i < newSize1; i++) {
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
    private static int removeDuplicatesNotSorted(int[] arr) {
        int len = arr.length;
        int ind = 1;
        HashSet<Integer> setno = new HashSet<>();
        setno.add(arr[0]);
        for (int i = 1; i < len; i++) {
            if(!setno.contains(arr[i])){
                arr[ind++] = arr[i];
                setno.add(arr[i]);
            }
        }
        return ind;
    }
}
