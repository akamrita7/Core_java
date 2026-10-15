package New2026.interview;

import java.util.LinkedHashMap;
import java.util.Map;

//a , b, c , a, c, e ,b, d  Find First non-duplicating char
public class FirstNonRepeatingChar {
    public static void main(String[] args){
        String[] charArray = new String[]{"a" , "b" , "c" , "a" , "c" , "e" , "b" , "d"};
        findNonDuplicateChar(charArray);
    }

    private static void findNonDuplicateChar(String[] charArray) {
        Map<String , Integer> countChar = new LinkedHashMap<>();
        //Set<String> a1 = new TreeSet<>(Arrays.asList(charArray));
        //System.out.println(a1);
        for(int i = 0 ; i<charArray.length ; i++){
            String charValue = charArray[i];
            if(countChar.containsKey(charValue)){
                countChar.put(charValue , countChar.get(charValue) +1);
            }else{
                countChar.put(charValue , 1);
            }
        }
       /* countChar.forEach((s, i) -> {
            if(i.equals(1)) {
                System.out.println("First non-duplicating char is : " + s);
            }
        });*/
        for(Map.Entry<String , Integer> countChar1 : countChar.entrySet()){
            if(countChar1.getValue().equals(1)){
                System.out.println("First non-duplicating char is : " + countChar1.getKey());
                break;
            }
        }

    }
}
