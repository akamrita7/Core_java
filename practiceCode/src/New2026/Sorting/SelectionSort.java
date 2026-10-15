package New2026.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        }

    private void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[min_idex] > arr[j])
                    min_idex = j;
            }
            int temp = arr[min_idex];
            arr[min_idex] = arr[i];
            arr[i] = temp;
        }
    }

    private void printArray(int[] arr) {
        Arrays.stream(arr).forEach(x-> System.out.println(x));
    }
}
