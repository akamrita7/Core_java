package applyPrac;
//https://www.geeksforgeeks.org/find-top-k-or-most-frequent-numbers-in-a-stream/

import java.util.*;

public class TopKelement {
    public static void main(String[] args) {
        int k = 4;
        int[] arr = { 5, 2, 1, 3, 2 }; //// 5 2 5 1 2 5 1 2 3 5 2 1 3 5
        int n = arr.length;
//        kTop(new int[]{ 5, 2, 1, 3, 2 },  4);
        System.out.println();
//        kTop(new int[]{ 5, 2, 1, 3, 4 },  4); //5 2 5 1 2 5 1 2 3 5 1 2 3 4
        kTop(new int[]{ 5, 2, 1, 3, 2  },  4); //5 2 5 1 2 5 1 2 3 5 2 1 3 5
    }

    private static void kTop(int[] arr, int k) {
        int n = arr.length;
        TreeSet<Integer> sort = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(sort.size()==k){
                sort.pollLast();
            }
            sort.add(arr[i]);
            list.addAll(sort);
        }
        list.forEach(System.out::print);
    }

}
