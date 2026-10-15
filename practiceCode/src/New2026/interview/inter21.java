package New2026.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class inter21 {
    public static void main(String[] args){
        String s = "amrita";
        findduplicate(s);
    }

    private static void findduplicate(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(count.containsKey(c)){
                count.put(c, count.get(c)+1);
            }else{
                count.put(c,1);
            }
        }
        Map<Object, Long> count1 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(x-> x , LinkedHashMap::new , Collectors.counting()));
        count1.entrySet().stream().filter(x -> x.getValue()>1).forEach(x -> System.out.println("char: "+x.getKey()+ " count: " + x.getValue()));
    }
}
