package New2026.Array;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args){
        Integer[] arr = new Integer[]{1,11,12,2,3,5,67,44,345};
        Random r = new Random();
        int index , temp;
        for (int  i = arr.length-1 ;i>0;i--){
           index = r.nextInt(i+1);
           if(index != i) {
               temp = arr[index];
               arr[index] = i;
               arr[i] = temp;
           }

        }
        Arrays.asList(arr).forEach(System.out::println);
    }
}
