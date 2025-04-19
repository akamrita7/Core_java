package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class WordPattern {
    public static void main(String[] args) {
//        System.out.println(findPattern("aba","dog cat cat")); // f
//        System.out.println(findPattern("abba","dog cat cat dog")); //t
//        System.out.println(findPattern("abba","dog cat cat fish")); // f
//        System.out.println(findPattern("aaaa","dog cat cat dog")); //f
        System.out.println(findPattern("abba","dog dog dog dog")); //f
    }

    private static boolean findPattern(String pattern, String s) {
        HashMap<String,String> map1 = new HashMap<>();
        List<String> p1 = Arrays.stream(pattern.split("")).toList();
        List<String> p2 =Arrays.stream(s.split(" ")).toList();
        if(p1.size() != p2.size()){
            return false;
        }
        for (int i = 0; i < p1.size(); i++) {
            String v1 = p1.get(i);
            String v2 = p2.get(i);
            if(!map1.containsKey(v1)){
                if( !map1.containsValue(v2)){
                    map1.put(v1,v2);
                }else{
                    return false;
                }
            }else{
                if(!map1.get(v1).equals(v2)){
                    return false;
                }
            }
        }
        return true;
    }
}
