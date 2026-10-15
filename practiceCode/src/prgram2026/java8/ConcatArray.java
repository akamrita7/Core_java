package prgram2026.java8;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatArray {
    public static void main(String[] args) {
//        concatingString();
//        sortBasedOnList();
//        totalAmountPerCategory();
//        convertToUpperrCase();
        AllStatusFailed();
    }
//You have a Map<String, List<Order>>. Using streams, how would you get all orders with status = “FAILED”?
    private static void AllStatusFailed() {
        Map<String, List<Order>> ordersByUser = new HashMap<String, List<Order>>();
        List<Order> failedOrders = ordersByUser.values().stream()
                .flatMap(List::stream)                           // flatten List<List<Order>> to Stream<Order>
                .filter(order -> "FAILED".equals(order.getStatus())) // filter by status
                .toList();

    }

    //Convert a comma-separated string into a sorted List<String> of unique uppercase elements using Stream API
    private static void convertToUpperrCase() {
        String input = "apple,banana,Apple,orange,banana";
        List<String> list = Arrays.stream(input.split(",")).map(String::toUpperCase).sorted().toList();
        System.out.println(list);
    }

    private static void totalAmountPerCategory() {
        List<Transaction> transactions = List.of(
                new Transaction(100L , LocalDate.now() , "mobile"),
                new Transaction(100L , LocalDate.now() , "TV"),
                new Transaction(200L , LocalDate.now() , "TV"),
                new Transaction(100L , LocalDate.now() , "Cloth"),
                new Transaction(400 , LocalDate.now() , "Cloth"));
        Map<String, Double> totalPerCategory = transactions.stream().collect(
                Collectors.groupingBy(Transaction::getCategory , Collectors.summingDouble(Transaction::getAmount))
        );
        System.out.println(totalPerCategory);
        Map<String, Double> avgPerCategoryForMonth = transactions.stream().collect(
                Collectors.groupingBy(Transaction::getCategory , Collectors.averagingDouble(Transaction::getAmount))
        );
        System.out.println(avgPerCategoryForMonth);

    }

    private static void sortBasedOnList() {
        List<Employee> employees = List.of(
                new Employee(1, "Alice", List.of("Java", "Spring", "SQL")),
                new Employee(2, "Bob", List.of("Java", "AWS", "Docker")),
                new Employee(3, "Charlie", List.of("Python", "Docker", "Kubernetes"))
        );
        List<String> sortedDistinctSkills =
                employees.stream().flatMap(x -> x.getSkills().stream())
                .distinct().sorted()
                .toList();
        System.out.println(sortedDistinctSkills);

    }

    private static void concatingString() {
        List<String> list1 = Arrays.asList("apple", "banana", "cherry");
        List<String> list2 = Arrays.asList("banana", "date", "apple", "fig");
        List<String> mergeList = Stream
                .concat(list1.stream(),list2.stream())
                .distinct().toList();
        System.out.println(mergeList);
    }
}
