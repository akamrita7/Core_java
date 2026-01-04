package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiIntermediate {
    record User(int id, String name) {}
    public static void main(String[] args) {
//        findSecondHighest();
//        findSecondLowest();
//        findMaximum();
//        findDuplicate();
//        findElemntOfMaxFreq();
//        groupByOddEven();
//        converListToMap();
//        removeNull();
        findLongestString();
    }

    private static void findLongestString() {
        List<String> fruits = List.of("apple", "banana", "cherry", "strawberry");
        String s = fruits.stream().max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println(s);
        Optional<String> reduce = fruits.stream().reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2);
        System.out.println(reduce);
    }

    //29.	Remove null values from list
    private static void removeNull() {
        List<String> listWithNulls = Arrays.asList("A", null, "B", null, "C");
        List<String> list = listWithNulls.stream().filter(Objects::nonNull).toList();
        System.out.println(list);
//        listWithNulls.removeIf(Objects::nonNull);
//        System.out.println(listWithNulls);
//        List<String> listWithNulls1 = Arrays.asList("A", null, "B", null, "C");
//        listWithNulls1.removeAll(Collections.singleton(null));
//        System.out.println(listWithNulls1);
    }

    //    Convert list to map
    private static void converListToMap() {
        List<User> users = List.of(new User(1, "Alice"), new User(2, "Bob"));
        Map<Integer, User> collect = users.stream().collect(Collectors.toMap(User::id, Function.identity()));
        collect.entrySet().forEach(x -> System.out.println(x.getKey() + "  "+ x.getValue()));
//        If the list might contain duplicate keys (e.g., two users with the same ID), you must provide a merge function. Otherwise, the code will throw an IllegalStateException
        Map<Integer, User> userMap = users.stream()
                .collect(Collectors.toMap(
                        User::id,
                        Function.identity(),
                        (existing, replacement) -> existing // Keep the first one found
                ));
//        Standard Collectors.toMap does not guarantee the order of entries. If you want to maintain the insertion order of your original List in Java 21, specify a LinkedHashMap supplier.
        Map<Integer, User> orderedMap = users.stream()
                .collect(Collectors.toMap(
                        User::id,
                        Function.identity(),
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new // Maintains original list order
                ));
    }

    //        25.	Group numbers by even/odd
    private static void groupByOddEven() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println("Even: " +collect.get(true));
        System.out.println("Odd: "+collect.get(false));
        Map<String, List<Integer>> collect1 = numbers.stream().collect(Collectors.groupingBy(x -> x % 2 == 0 ? "Even" : "Odd"));
        System.out.println("Even: " +collect1.get("Even"));
        System.out.println("Odd: "+collect1.get("Odd"));
    }

    //22.	Find element with maximum frequency
    private static void findElemntOfMaxFreq() {
        List<Integer> numbers = List.of(1, 3, 2, 1, 4, 1, 2, 2, 2);
        Integer l = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(l);
    }

    //    19.	Find duplicate elements
    private static void findDuplicate() {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 1, 5);
        List<Integer> list = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey).toList();
        System.out.println(list);
        List<Integer> list1 = numbers.stream().filter(n -> Collections.frequency(numbers, n) > 1).toList();
        System.out.println(list1);
    }


//17.	Find maximum element
    private static void findMaximum() {
        //This is the most straightforward method for finding the maximum value in any collection that implements Comparable. It throws a NoSuchElementException if the list is empty.
        List<Integer> numbers = List.of(3, 9, 1, 8, 5);
        int max1 = Collections.max(numbers);
        //Use the Stream API if you need to find the maximum based on a specific property of an object or if you want to handle empty lists safely using Optional.
        int max2 = numbers.stream().max(Comparator.naturalOrder()).orElse(0);
        System.out.println("max1 : " + max1 + " max2 : "+ max2);
        //For large lists of integers, converting to a primitive IntStream avoids the overhead of object wrappers (unboxing) and provides a highly efficient .max() method
        int i = numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println(i);
    }

    private static void findSecondLowest() {
        List<Integer> numbers = List.of(3, 5, 9, 9, 8, 2);
        Integer i = numbers.stream().distinct().sorted()
                .skip(1).findFirst().orElseThrow(() -> new RuntimeException());
        System.out.println(i);
    }
    //15.	Find second highest number
    private static void findSecondHighest() {
        List<Integer> numbers = List.of(3, 5, 9, 9, 8, 2);
        Integer i = numbers.stream().distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElseThrow(() -> new RuntimeException());
        System.out.println(i);
    }
}
