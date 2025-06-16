package MediumProblemsArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindTripletsArray {
    static List<List<Integer>> findTriplets(int[] arr) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                int val = -1 * (arr[j] + arr[k]);
                if (map.containsKey(val)) {
                    for (int i : map.get(val)) {
                        ans.add(Arrays.asList(i, j, k));
                    }
                }
            }
            map.putIfAbsent(arr[j], new ArrayList<>());
            map.get(arr[j]).add(j);
        }return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        List<List<Integer>> res = findTriplets(arr);
        for (List<Integer> triplet : res) {
            System.out.println(triplet.get(0) + " " + triplet.get(1) + " " + triplet.get(2));
        }
    }
}
