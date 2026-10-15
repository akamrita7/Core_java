package New2026.java8.program;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class synechron implements Serializable {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(1);
        Integer a = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(a);
    }
}
