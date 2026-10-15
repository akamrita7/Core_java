package New2026.interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GeneralJava8 {
    public static void main(String[] args){
        final Map<String, Integer> wordCounts = new HashMap<>();
        wordCounts.put("USA", 100);
        wordCounts.put("jobs", 200);
        wordCounts.put("software", 50);
        wordCounts.put("technology", 70);
        wordCounts.put("opportunity", 200);
        //switchJava12();
        // sort by value
        final Map<String, Integer> wordCountsSorted = wordCounts.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        Map<String, Integer> sortedByCount = wordCounts.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        sortedByCount.forEach((x,y) -> System.out.println(x + " "+ y));
    }

    /*private static void switchJava8() {
        Integer month = 2;
        var result = switch (month) {
            case "JANUARY", "JUNE", "JULY" -> 3;
            case "FEBRUARY", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" -> 1;
            case "MARCH", "MAY", "APRIL", "AUGUST" -> 2;
            default -> 0;
        };
    }*/
}

