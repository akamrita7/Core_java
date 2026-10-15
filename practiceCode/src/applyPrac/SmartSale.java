package applyPrac;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SmartSale {

    public static int deleteProducts(List<Integer> ids, int m) {
        // Step 1: Count frequency of each ID
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int id : ids) {
            freqMap.put(id, freqMap.getOrDefault(id, 0) + 1);
        }
        // Step 2: Sort frequencies in ascending order
//        List<Integer> frequencies = new ArrayList<>(freqMap.values());
//        Collections.sort(frequencies);
        List<Long> frequencies = ids.stream().collect(Collectors
                .groupingBy(Function.identity(),
                        Collectors.counting())).values().stream().sorted().toList();


        int distinct = frequencies.size();

        // Step 3: Remove entire IDs greedily
        for (long f : frequencies) {
            if (m >= f) {
                m -= f;
                distinct--;
            } else {
                break;
            }
        }

        return distinct;
    }

    // Example usage
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1, 1, 1, 2, 2, 3);
        int m = 2;
        System.out.println(deleteProducts(ids, m)); // Output: 2
    }
}
