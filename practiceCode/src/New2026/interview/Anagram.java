package New2026.interview;

import java.util.Map;
import java.util.TreeMap;

public class Anagram {
    public static void main(String[] args) {
        String a = "ARMYA";
        String b ="MARYA";
        if(checkAnagram(a, b))
        {
            System.out.println("It is a anagram");
        }else{
            System.out.println("It is not a anagram");
        }
    }

    private static boolean checkAnagram(String a, String b) {
        Map<Character,Integer> countA= new TreeMap<Character,Integer>();
        Map<Character,Integer> countB= new TreeMap<Character,Integer>();
        for(int i = 0 ; i<a.length(); i++){
//                countA.put(a.charAt(i),countA.get(a.charAt(i))+1);
                countA.put(a.charAt(i),countA.getOrDefault(a.charAt(i),0)+1);
        }
        for(int i = 0 ; i<b.length(); i++){
//            if(countB.containsKey(b.charAt(i))){
//                countB.put(b.charAt(i),countB.get(b.charAt(i))+1);
                countB.put(b.charAt(i),countB.getOrDefault(b.charAt(i),0)+1);
//            }else{
//                countB.put(b.charAt(i),1);
//            }
        }
        if(countA.equals(countB)){
            return true;
        }
        return false;
    }


}
