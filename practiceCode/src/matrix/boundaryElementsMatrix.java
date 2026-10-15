package matrix;

import java.util.ArrayList;

public class boundaryElementsMatrix {
    // Function which traverse Boundary elements of a Matrix
    static ArrayList<Integer> boundaryTraversal(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        ArrayList<Integer> res = new ArrayList<>();
        // Traverse the top row from left to right
        for (int j = 0; j < m; j++) {
            res.add(mat[0][j]);
        }
        // Traverse the last column, starting from 2nd row
        for (int i = 1; i < n; i++) {
            res.add(mat[i][m - 1]);
        }
        // Traverse the bottom row, starting from
        // second last column
        for (int j = m - 2; j >= 0; j--) {
            res.add(mat[n - 1][j]);
        }
        // Traverse the first column from bottom to
        // up, starting from second last row and
        // ending at second row.
        for (int i = n - 2; i > 0; i--) {
            res.add(mat[i][0]);
        }
        return res;
    }
    public static void printBoundary(int[][] a) {
        int m = a.length; int n = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if( i == 0 || j == 0 || i == m-1 || j == n-1){
                    System.out.print(a[i][j] + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

       /* ArrayList<Integer> res = boundaryTraversal(mat);
        for (int val : res) {
            System.out.print(val + " ");
        }
        System.out.println();*/
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        printBoundary(a);
//        boundaryTraversal(mat);
    }
}
