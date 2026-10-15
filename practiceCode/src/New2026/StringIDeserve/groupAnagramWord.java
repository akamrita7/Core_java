package New2026.StringIDeserve;
//https://www.geeksforgeeks.org/print-words-together-set-characters/#:~:text=Input%3A%20words%5B%5D%20%3D%20%7B%20%22,cat%2C%20act%2C%20All%20words%20with


import java.util.*;

public class groupAnagramWord {
    public static void main(String args[])
    {
        String words[] = { "may", "student", "student", "dog",
                "student", "god", "cat", "act", "tab",
                "bat", "flow", "wolf", "lambs", "amy", "yam",
                "balms", "looped", "poodle"};
        int n = words.length;
        wordsWithSameCharSet(words, n);
    }

    private static void wordsWithSameCharSet(String[] words, int n) {
        Map<String, List<String>> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(hash.containsKey(key)){
                List<String> al = hash.get(key);
                al.add(words[i]);
                hash.put(key,al);
            }else{
                List<String> al = new ArrayList<>();
                al.add(words[i]);
                hash.put(key,al);
            }
        }
        hash.values().forEach(x -> {
            System.out.print("[");
            x.forEach(y -> System.out.print(y +","));
            System.out.println("]");
        });
    }
}
