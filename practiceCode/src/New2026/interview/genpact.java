package New2026.interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class genpact {
    public static void main(String[] args){
        BiFunction<Integer,Integer,Integer> f1 = (x, y)-> x+y;
//        System.out.println(f1.apply(10,20));
        List<Integer> list = Arrays.asList(1 , 2 , 10);
        int sum = 0;
        System.out.println(list.stream().reduce(Integer::sum).get());

    }
}
