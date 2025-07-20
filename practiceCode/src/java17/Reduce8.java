package java17;

import java.util.Arrays;
import java.util.List;

public class Reduce8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce((x,y) -> x+y).get();
        numbers.stream().mapToInt(Integer::intValue).sum();
    }
}
