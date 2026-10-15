package New2026.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class waterConnection {
    // Function to find tank-tap pairs
    static List<List<Integer>> findWaterDistribution(int n, int p,
                                                     List<Integer> a,
                                                     List<Integer> b,
                                                     List<Integer> d) {
        int[] outgoing = new int[n + 1],
                incoming = new int[n + 1],
                diameter = new int[n + 1];
        Arrays.fill(outgoing, -1);
        Arrays.fill(incoming, -1);
        Arrays.fill(diameter, Integer.MAX_VALUE);
        for (int i = 0; i < p; i++) {
            outgoing[a.get(i)] = b.get(i);
            incoming[b.get(i)] = a.get(i);
            diameter[a.get(i)] = d.get(i);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (outgoing[i] != -1 && incoming[i] == -1) {
                int curr = i, minDia = Integer.MAX_VALUE;
                while (outgoing[curr] != -1) {
                    minDia = Math.min(minDia, diameter[curr]);
                    curr = outgoing[curr];
                }
                result.add(Arrays.asList(i, curr, minDia));
            }
        }
        return result;
    }

    static void print2dArray(List<List<Integer>> arr) {
        System.out.print("[");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i != arr.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        int n = 9, p = 6;
        List<Integer> a = Arrays.asList(7, 5, 4, 2, 9, 3),
                b = Arrays.asList(4, 9, 6, 8, 7, 1),
                d = Arrays.asList(98, 72, 10, 22, 17, 66);

        List<List<Integer>> ans
                = findWaterDistribution(n, p, a, b, d);

        print2dArray(ans);
    }
}
