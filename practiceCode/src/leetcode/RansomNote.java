package leetcode;
/*Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
        Each letter in magazine can only be used once in ransomNote.
        Example 1:
        Input: ransomNote = "a", magazine = "b"
        Output: false
        Example 2:
        Input: ransomNote = "aa", magazine = "ab"
        Output: false*/
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
//https://leetcode.com/problems/ransom-note/description/
public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aabb", magazine = "aaabb";
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
