package MediumProblemsArray;

import java.util.ArrayList;

public class FindFirstLastPositions {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;
        ArrayList<Integer> res = find(arr, x);
        System.out.println(res.get(0) + " " + res.get(1));
    }

    private static ArrayList<Integer> find(int[] arr, int x) {
        int first = 0 , last = arr.length-1;
        ArrayList<Integer> pos = new ArrayList<>();
        int first1 = -1 , last1 = -1 ;
        while(first <= last){
           if(arr[first] == x && first1 == -1){
               first1 = first;
               pos.add(first1);
           }
            if(arr[last] == x && last1 == -1){
                last1 = last;
                pos.add(last1);
            }
            if(first1>-1 && last1>-1){
                break;
            }
            first++;
            last--;

        }
        return pos;
    }
}
