package New2026.Array;

import java.util.*;

//https://www.geeksforgeeks.org/find-k-numbers-occurrences-given-array/
public class KmostOccuringElt{
    public static void main(String[] args)
    {
        int arr[] = { 3, 1, 4, 4, 5, 2, 6, 1 ,5, 5};
        int N = arr.length;
        int K = 2;

        // Function call
        System.out.println(
                K + " numbers with most occurrences are:");
        print_N_mostFrequentNumberCollection(arr, N, K);
        System.out.println("__________________________________________________________________________");
        print_N_mostFrequentNumberPriority(arr, N, K);
    }

    private static void print_N_mostFrequentNumberPriority(int[] arr, int n, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        for (int i = 0 ;i < n ; i++){
            count.put(arr[i],count.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> queque = new PriorityQueue<>((x,y)->y.getValue().compareTo(x.getValue()));
        count.entrySet().forEach(queque::offer);
        for (int i = 0 ;i < k ; i++){
            System.out.println(queque.poll().getKey());
        }
    }

    private static void print_N_mostFrequentNumberCollection(int[] arr, int n, int k) {
        //Map<Integer,Long> count = Arrays.stream(arr).collect(Collectors.toMap(x-> x ,Collectors.counting()));
        Map<Integer,Integer> count = new HashMap<>();
        for (int i = 0 ;i < n ; i++){
            count.put(arr[i],count.getOrDefault(arr[i], 0)+1);
        }
        List<Map.Entry<Integer,Integer>>  list = new ArrayList<>(count.entrySet());
        Collections.sort(list, (x,y) -> y.getValue().compareTo(x.getValue()));
        list.stream().limit(k).forEach(x ->System.out.println(x.getKey()));

    }
}
