package New2026.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://www.geeksforgeeks.org/majority-element/
public class FindMajorityFromArray {
    public static void main(String[] args){
        int[] arr = new int[]{2,2,2,2,5,5,2,3,3}; //output 2
        findMajority(arr);
        findMajority1(arr);
    }

    private static void findMajority1(int[] arr) {
        System.out.println(Arrays.stream(arr) // Create an IntStream from the array
                .boxed() // Convert IntStream to Stream<Integer> (needed for Collectors.groupingBy)
                .collect(Collectors.groupingBy(
                        Function.identity(), // Group elements by their own value (the key in the map)
                        Collectors.counting() // Count the occurrences of each grouped element
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue()));

    }

    private static void findMajority(int[] arr) {
        HashMap<Integer , Integer> count = new HashMap<>();
        for (int i =0 ; i<arr.length ; i++){
            if(count.containsKey(arr[i])){
                int countNum = count.get(arr[i])+1;
                if(countNum > arr.length/2){
                    System.out.println("Majority found : " + arr[i]);
                    return;
                }else {
                    count.put(arr[i], countNum);
                }
            }else {
                count.put(arr[i], 1);
            }
        }
    }
}
