package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aaab";
        System.out.println(canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<String, Long > m1 = Arrays.stream(magazine.split(""))
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));
        Map<String, Long > r1 = Arrays.stream(ransomNote.split(""))
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));
        for (var entry : r1.entrySet()){
            if(!(m1.containsKey(entry.getKey()) && entry.getValue()<=(m1.get(entry.getKey())))){
                return false;
            }
        }
        return true;
    }
}
