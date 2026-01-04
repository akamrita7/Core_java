package stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BasicStream {
    public static void main(String[] args) {
//        evenNumbersFinder();
//        oddNumbersFinder();
//        numbersGreaterThanX();
//        converListToUpperCase();
//        countNumberOfElemtInList();
//        distinctNumbers();
//        sortAsc();
//        sortDesc();
//        sumAllNumber();
//        averageOfAllNumber();
        joinString();
    }
    //    16.	Join list of strings with comma
    private static void joinString() {
        List<String> list = List.of("apple", "banana", "cherry");
        String join = String.join(",", list);
        System.out.println(join);
        String collect = list.stream().collect(Collectors.joining(","));
        System.out.println(collect);
    }


    private static void averageOfAllNumber() {
        List<Integer> numbers = List.of(10, 20, 30, 40);
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(average);
        Double collect = numbers.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(collect);
    }

    //   13.	Sum of all numbers
    private static void sumAllNumber() {
//        This is the standard approach in modern Java. Because lists contain objects (like Integer), they must be unboxed to primitive int values before they can be summed efficiently using an IntStream
        List<Integer> numbers = List.of(10, 20, 30, 40);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
//        You can use the reduce terminal operation to combine all elements into a single sum. This is useful for more complex reduction logic but is slightly more verbose than sum()
        Integer reduce = numbers.stream().reduce(0, Integer::sum);
        System.out.println(reduce);
        //If you are already performing a collection operation, you can sum the elements as part of the collection process
        IntSummaryStatistics collect = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(collect);
    }
//9.	Sort numbers descending
    private static void sortDesc() {
        //This approach is ideal if you want to keep the original list unchanged. You pass Comparator.reverseOrder() to the sorted()
        List<Integer> numbers = List.of(5, 2, 9, 1);
        List<Integer> descending = numbers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(descending);
//        For mutable lists like ArrayList, you can sort them directly without creating a new object. This is more memory-efficient for large datasets
        List<Integer> mutableNumbers = new ArrayList<>(List.of(5, 2, 9, 1));
// Updates original list directly
        mutableNumbers.sort(Comparator.reverseOrder());
        System.out.println("mutableNumbers: " + mutableNumbers + "\n");
        /*Sorting Primitive Arrays (int[])
        Java's Arrays.sort() does not directly support a reverse comparator for primitive types like int[]. You have two options:
        Box to Integer: Convert to a stream, box to objects, sort, and convert back.
        Sort and Reverse: Sort in ascending order first, then reverse the array manuall*/
        int[] arr = {5, 2, 9, 1};
        int[] sortedDesc = Arrays.stream(arr).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
        Arrays.stream(sortedDesc).forEach(System.out::print);
    }

    //7.	Sort numbers ascending
    private static void sortAsc() {
        List<Integer> numbers = new ArrayList<>(List.of(5, 2, 9, 1));
        numbers.sort(Comparator.naturalOrder());
        System.out.println("List :" + numbers);
        int[] arr = {5, 2, 9, 1};
        Arrays.sort(arr);
        System.out.println(arr.toString());
        List<Integer> original = List.of(5, 2, 9, 1);
        List<Integer> sorted = original.stream().sorted().toList();
        System.out.println(sorted);
    }

    //6.	Find distinct elements
    private static void distinctNumbers() {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctNumbers = numbers.stream().distinct().toList();
        System.out.println("distinctNumbers :" + distinctNumbers);
    }

    //5.	Count number of elements in a list
    private static void countNumberOfElemtInList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long count = numbers.stream().filter(x -> x % 2 == 0).count();
        System.out.println("count : " + count);
    }

    //4.	Convert list of strings to uppercase
    private static void converListToUpperCase() {
        List<String> original = List.of("apple", "banana", "cherry");
        List<String> uppercase = original.stream().map(String::toUpperCase).toList();
        System.out.println("uppercase: " + uppercase);
    }

    //1.	Find even numbers from a list
    private static void evenNumbersFinder() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumber = numbers.stream().filter(x -> x % 2 == 0).toList();
       System.out.println("evenNumber: " + evenNumber);
    }
    //2.	Find odd numbers
    private static void oddNumbersFinder() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumber = numbers.stream().filter(x -> x % 2 != 0).toList();
       System.out.println("oddNumber: " + oddNumber);
    }
    //3.	Find numbers greater than X
    private static void numbersGreaterThanX(){
        int X = 10;
        List<Integer> numbers = Arrays.asList(5, 7, 84, 2, 3, 78);
        List<Integer> list = numbers.stream().filter(num -> num > X).toList();
        System.out.println(list);
    }
}
