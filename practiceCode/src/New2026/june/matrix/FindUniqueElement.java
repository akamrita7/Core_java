package New2026.june.matrix;

import java.util.HashMap;
import java.util.Map;
//https://www.geeksforgeeks.org/dsa/find-unique-elements-matrix/
public class FindUniqueElement {
    public static void main(String[] args) {
        int[][] mat = {{ 1, 2, 3, 20 },
                { 5, 6, 20, 25 },
                { 1, 3, 5, 6 },
                { 6, 7, 8, 15 }};
        unique(mat);
        
    }

    private static void unique(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Map<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mp.put(mat[i][j],mp.getOrDefault(mat[i][j],0)+1);
            }
        }
        mp.entrySet().forEach(entry -> {
            if (entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        });

    }
}
