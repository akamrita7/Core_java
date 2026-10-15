package New2026.Array;

//(apple, banana, orange,guava , papaya, watermelon)

import java.util.Arrays;
import java.util.Collections;

public class sortArrayBasedOn2Char {
    public static void main(String[] args){
        String[] names = {"apple","watermelon","orange","guava", "papaya","banana"};
        /*Collections.sort(Arrays.asList(names), new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                 if(s1.charAt(1)-s2.charAt(1)==0){
                   return s1.charAt(2)-s2.charAt(2) ;
                };
                return s1.charAt(1)-s2.charAt(1);
            }
        });*/
        Collections.sort(Arrays.asList(names) , (s1,s2) -> s1.charAt(1)-s2.charAt(2) ==0 ?  s1.charAt(2)-s2.charAt(2) : s1.charAt(1)-s2.charAt(1));

       for (  String name : names) {
           //watermelon  apple  orange  guava  papaya  banana
           System.out.print(name + "  ");
       }

    }

}
