package New2026.java8;


import java.util.*;
import java.util.stream.Collectors;

public class int7 {
    public static void main(String[] args){
        //[1,2,3,4,5,6] --> [3,7,11]
        //[Amrita, Uday, Sugan, Sugan, Uday, Amrita, Amrita, Kumari] --> [Amrita, Uday, Sugan, Kumari]
        List<String> arr = Arrays.asList("Amrita","Uday", "Sugan", "Uday", "Amrita", "Amrita", "Kumari");
        getAddedArray(arr).stream();
        for(int i = 0 ; i <arr.size();i++) {
            System.out.println(arr.get(i));
        }
    }

    private static List<String> getAddedArray(List<String> arr) {
        Map<String,Integer> count = new HashMap<>();
        for(int i = 0 ; i <arr.size();i++){
            String n = arr.get(1);
            if(count.containsKey(n)){
                count.put(n, count.get(n)+1);
            }else{
                count.put(n,1);
            }
        }
        // count.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).map(x -> x.getKey()).collect(Collectors.toList());
        return count.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(x -> x.getKey()).distinct().collect(Collectors.toList());

    }


}
