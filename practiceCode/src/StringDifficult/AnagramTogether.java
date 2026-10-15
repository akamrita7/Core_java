package StringDifficult;

import java.util.*;
import java.util.stream.Collectors;

public class AnagramTogether {
    static final int MAX_CHAR = 26;
    static String getHash(String s) {
        StringBuilder hash = new StringBuilder();
        int[] freq = new int[MAX_CHAR];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int i = 0; i < MAX_CHAR; i++) {
            hash.append(freq[i]);
            hash.append("$");
        }
        return hash.toString();
    }

    static ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String key = getHash(arr[i]);
            if (!mp.containsKey(key)) {
                mp.put(key, res.size());
                res.add(new ArrayList<>());
            }
            res.get(mp.get(key)).add(arr[i]);
        }
        return res;
    }

    static void anagrams1(String[] arr) {
        Map<String,List<String>> map = new HashMap<>();
        List<String> words = Arrays.asList(arr);
        for (String word : words){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        map.entrySet().stream().forEach(x -> {
            System.out.println(x.getValue());
        });
    }
    static void anagrams8(String[] arr) {
        List<String> list = Arrays.asList(arr);
        Collection<List<String>> res =  list.stream().collect(
                Collectors.groupingBy(x ->
                       Arrays.stream(x.toLowerCase().split("")).
                                sorted().toList())).values();
        System.out.println("arr = " + res);
    }

    public static void main(String[] args) {
        String[] arr = {"act", "god", "cat", "dog", "tac"};
        System.out.println("Using java 21");
//        anagrams8(arr);
        anagrams1(arr);
        /*System.out.println("Using java 7");
        Map<String,List<String>> anagrams1 = anagrams1(arr);
        anagrams1.entrySet().forEach(x -> {
            System.out.println(x.getValue());
        });
        ArrayList<ArrayList<String>> res = anagrams(arr);
        for (List<String> group : res) {
            for (String word : group) {
                System.out.print(word + " ");
            }
            System.out.println();
        }*/
    }


}
