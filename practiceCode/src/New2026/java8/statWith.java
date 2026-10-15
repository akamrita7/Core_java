package New2026.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class statWith {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,11,12,2,3,5,67,44,345);
        list.stream().filter(x -> x.toString().startsWith("1")).forEach(System.out::println);
        System.out.println("args = " );
        Collections.shuffle(list);
        list.forEach(System.out::println);

    }
}
