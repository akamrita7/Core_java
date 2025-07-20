package java17;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> duplicates = IntStream.of( 1, 2, 3, 2, 1, 2, 3, 4, 2, 2, 2 )
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream().filter(x -> x.getValue()>1)
                .map(Map.Entry :: getKey)
                .toList();
        duplicates.forEach(System.out::println);

    }
}
