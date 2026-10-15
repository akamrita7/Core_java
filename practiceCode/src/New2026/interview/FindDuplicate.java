package New2026.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicate {
    public static void main(String[] args) {
        List<String> nam = Arrays.asList("B","A","A","C","B","A");
       countChar(nam);
       countChar2(nam);
    }

    private static void countChar2(List<String> nam) {


    }

    private static void countChar(List<String> nam) {
        Map<String,Integer> count = new HashMap<>();
        for( String a : nam){
            if(count.containsKey(a)){
                count.put(a,count.get(a)+1);

            }else{
                count.put(a,1);
            }

        }
        for(Map.Entry<String,Integer> nam1 : count.entrySet()){
            System.out.println("char : " + nam1.getKey() + " count :" + nam1.getValue());
        }
    }


}
