package New2026.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class Interview {
    public static void main(String[] args){
        String name = "javaj";
        nonReapting(name);
    }

    private static void nonReapting(String name) {
        //Arrays.stream(name.split("")).map((x,v)->)
        Map<Character,Integer> charCount  = new LinkedHashMap<>();
        for(int i =0 ; i < name.length() ; i++){
            if(charCount.containsKey(name.charAt(i))){
                charCount.put(name.charAt(i), charCount.get(name.charAt(i))+1);
            }else{
                charCount.put(name.charAt(i), 1);
            }
        }
        for(Map.Entry<Character,Integer> entry : charCount.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("First Non repeating character is :" + entry.getKey());
            }
        }
    }

}
