package New2026.java8;



import New2026.java8.program.Emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class interview2 {
    public static void main(String[] args){
        Emp e1 = new Emp("1","abc1");
        Emp e2 = new Emp("2","abc2");
        Emp e3 = new Emp("3","abc3");
        Emp e4 = new Emp("1","abc1");
        List<Emp> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        String word = "AAABBBC";
        Map<String, Long> charCount = word.codePoints().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Object, Long> charCount1 = word.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        charCount1 = Arrays.stream(word.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
        charCount1.forEach((x,y) -> System.out.println(x + " "+y));


    }
}
