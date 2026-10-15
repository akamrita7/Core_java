package New2026.StringIDeserve;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatingString {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
//        String str = "ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB";
        firstNonRepeating1(str);
    }

    private static void firstNonRepeating1(String str) {
        int[] freq = new int[26];
        for (char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
           if(freq[str.charAt(i)-'a']==1 ){
               System.out.println(str.charAt(i));
               break;
           }
        }
    }


    private static void firstNonRepeating(String str) {
        HashMap<Character,Integer> stringCount = new LinkedHashMap();
            for(int i = 0 ; i< str.length(); i++){
                Character c = str.charAt(i);
                if(stringCount.containsKey(c)){
                    stringCount.put(c, stringCount.get(c)+1);
                }else{
                    stringCount.put(c,1);
                }
            }
            for(Map.Entry<Character,Integer> entry : stringCount.entrySet()){
                if(entry.getValue()==1){
                    System.out.println("First Non repeating Character is: " +entry.getKey());
                    break;
                }
            }
    }
}
