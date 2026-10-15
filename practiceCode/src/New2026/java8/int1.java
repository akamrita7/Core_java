package New2026.java8;

import java.util.ArrayList;
import java.util.List;

public class int1 {
    public static void main(String[] args){
        String s = "This is a very very very long test String";
        List<String> results = new ArrayList<>();
        int i = 0, j =0;
        while (i<s.length()-1){
            results.add(s.substring(i,i+5));
            j = i;
            i = i +5;
        }
        results.add(s.substring(i,s.length()));
        results.forEach(System.out::println);
        Integer i1=129;
        Integer i2=129;
        System.out.println(i1==i2);
    }


}
