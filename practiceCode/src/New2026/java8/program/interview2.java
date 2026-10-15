package New2026.java8.program;

import java.util.HashMap;
import java.util.Map;

public class interview2 {
    public static void main(String[] args){
        Map<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(22,"A");
        hashmap.put(55,"B");
        hashmap.put(33,"Z");
        hashmap.put(44,"M");
        hashmap.put(99,"I");
        hashmap.put(88,"X");
        hashmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x -> System.out.println(x.getKey() + ":" +x.getValue()));

    }
}
