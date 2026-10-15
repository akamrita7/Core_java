package MediumProblemsArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//Triplet with sum zero
// https://www.geeksforgeeks.org/dsa/find-triplets-array-whose-sum-equal-zero/
/*Input: arr[] = [0, -1, 2, -3, 1]
        Output: [[0, 1, 4], [2, 3, 4]]
        Explanation:  Two triplets with sum 0 are:
        arr[0] + arr[1] + arr[4] = 0 + (-1) + 1 = 0
        arr[2] + arr[3] + arr[4] = 2 + (-3) + 1 = 0
        Input: arr[] = [1, -2, 1, 0, 5]
        Output: [[0, 1, 2]]
        Explanation: Only triplet which satisfies the condition is arr[0] + arr[1] + arr[2] = 1 + (-2) + 1 = 0
        Input: arr[] = [2, 3, 1, 0, 5]
        Output: []
        Explanation: There is no triplet with sum 0*/
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
