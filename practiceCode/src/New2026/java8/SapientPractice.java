package New2026.java8;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SapientPractice {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,1,3,4,4);
//        findDuplicate(numbers);
//        findFirstNonRepeatingChar("abcsadnvs");
//        occurrenceOfEachElt("abcsadnvs");
        Integer[] number2 = {1,2,3,4,5,7,8};
        findMissingNumber(number2);
    }

    private static void findMissingNumber(Integer[] number2) {
        int n = number2.length-1;
        //AtomicInteger i = new AtomicInteger(0);
        AtomicInteger k = new AtomicInteger(0);
        System.out.println(Arrays.stream(number2).filter(x -> x!= k.getAndIncrement()).findFirst().get());
        /*int i = 1;
        for (int j = 0; j < n; j++) {
           if(number2[j] != i++) ;
            {
                System.out.println(i);
            }
        }*/
    }


    private static void occurrenceOfEachElt(String str) {
        str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> System.out.println("char: " +key+ " count: " +value));
    }

    private static void findFirstNonRepeatingChar(String str) {
        //str.chars().mapToObj(i -> (char)i).collect(Collectors.toList());
        Optional<String> firstNonRepeat = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(x ->x.getValue()==1).map(Map.Entry::getKey).findFirst();
        firstNonRepeat.ifPresent(System.out::println);
    }

    private static void findDuplicate(List<Integer> numbers) {
        Set<Integer> dup1 =numbers.stream().filter(x -> Collections.frequency(numbers,x)>1).collect(Collectors.toSet());
        dup1.forEach(System.out::println);
        Set<Integer> s = numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
                .stream().filter(e -> e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
        s.forEach(System.out::println);
        Set<Integer> duplicatedNumbersRemovedSet = new HashSet<>();
        Set<Integer> duplicatedNumbersSet = numbers.stream().filter(n -> !duplicatedNumbersRemovedSet.add(n)).collect(Collectors.toSet());
    }
}
