package New2026.java8.program;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateFromList8 {
public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4);
    dupliacteFromList(numbers);
    int[] missNumber = {1,2,3,4,5,6,7,8,9, 11,12};
//    FindMissingNumber(missNumber);
}

    private static void dupliacteFromList(List<Integer> numbers) {
        numbers.stream().filter(i -> Collections.frequency(numbers,i)>0).collect(Collectors.toSet()).forEach(System.out::println);
        Set<Integer> duplicatedNumbersRemovedSet = new HashSet<>();
        Set<Integer> duplicatedNumbersSet = numbers.stream().filter(n -> !duplicatedNumbersRemovedSet.add(n)).collect(Collectors.toSet());
        //duplicatedNumbersSet.forEach(System.out::println);

    }

    private static void FindMissingNumber(int[] missNumber) {
//    Map<Float,String> a = new HashMap();
//    a.put((float) .01,"");
    int n = missNumber[missNumber.length-1];
    int idealSum = (n*(n+1))/n;
    int sum = Arrays.stream(missNumber).sum();
    System.out.println(idealSum-sum);
    }

}
