package New2026.java8.program;

import java.util.Arrays;

//remove duplicate and sort array
//return number from array with even digit
//database for instagram
public class mobileint {
    //[11,222,333,4444]
    public static void main(String[] args){
        Integer[] arr = {11,222,333,4444};
       // NumberFromArrayEvenDigit(arr);
        Integer[] ar = { 4, 3, 9, 2, 4, 1, 10, 89, 34};
        removeDuplicateSort(ar);

    }

    private static void removeDuplicateSort(Integer[] ar) {
        int n = ar.length;
        int i =0 , j= 0;
        Arrays.sort(ar);
        while(i<n-1){
            ar[j]=ar[i];
            while (ar[i] == ar[i+1]){
                i++;
            }
            i++;
            j++;
        }
        while(j<n){
            ar[j]=null;
        }
        Arrays.stream(ar).forEach(System.out::println);
    }

    private static void NumberFromArrayEvenDigit(Integer[] arr) {
        int j;
        int count ;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            j = arr[i];
            while(j>0){
                j = j/10;
                count++;
            }

            if(count%2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}
