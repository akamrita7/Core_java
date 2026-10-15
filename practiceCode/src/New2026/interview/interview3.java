package New2026.interview;

import java.util.HashMap;
import java.util.Map;

//array  1 2 3 4 5  sum = 6
public class interview3 {
    public static void main(String[] args){
        Integer[] arr = {1, 2, 3, 4, 5 };
        Integer sum = 6; //
        findEleWithSum(arr,sum);
    }

    private static void findEleWithSum(Integer[] arr, Integer sum) {
        for (int i = 0 ; i < arr.length ; i++){
            int new_sum = sum - arr[i];
            Map number = new HashMap();
        for (int j =0 ; j < arr.length;j++) {
            int new_sum2 = new_sum - arr[j];
            if (number.containsKey(new_sum2)) {
                System.out.println(new_sum + " and " + arr[i] + " and " + arr[j] );
                return;
            } else {
                number.put(arr[j], 1);
            }
        }
        }
    }
}
