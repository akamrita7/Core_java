package New2026.Array;

import java.util.Arrays;

/*InputArray = {12, 17, 70, 15, 22, 65, 21, 90}

        outputArray = {12, 90, 70, 22, 15, 65, 21, 17}*/

public class SegregateEvenOdd {
    public static void main(String[] args){
        Integer[]  arr = {12, 17, 70, 15, 22, 65, 21, 90};
        //arrangeEvenOdd(arr);
        segregate(arr);

    }

    private static void segregate(Integer[] arr) {
        int len = arr.length;
        int start = 0;
        int end = len-1;
        while (start<end){
            if(arr[start]%2 ==1){
                if(arr[end]%2==0){
                    swap(arr,start,end);
                    start++;
                    end--;
                }else {
                    end--;
                }
            }else{
                start++;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void arrangeEvenOdd(Integer[] arr) {
        int len = arr.length;
        int start = 0;
        int end = len-1;
        //for(int i =0; i< len/2 ; i++)
        while(start<end){
            while (arr[start]%2 == 0 && start<end){
                start++;
            }
            while (arr[end]%2 == 1 && start<end){
                end--;
            }
            if(start<end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void swap(Integer[] arr, int start, int end) {
        int temp;
        temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }


}
