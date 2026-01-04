package matrix;

import java.util.Arrays;
//https://www.geeksforgeeks.org/dsa/search-in-row-wise-and-column-wise-sorted-matrix/
public class MatrixSearch {
    public static void main(String[] args) {
        int[][] mat = {
                {3, 30, 38}, //row j
                {20, 52, 54},
                {35, 60, 69}
                //col
        };
        int x = 35;
        if (matSearch(mat, x))
            System.out.println("true");
        else
            System.out.println("false");
    }

    private static boolean matSearch(int[][] mat, int x) { //int[row][col]
        int n = mat.length, m = mat[0].length;
        int i = 0, j = m - 1;
        while (i < n && j >= 0) {
            // If x > mat[i][j], then x will be greater
            // than all elements to the left of
            // mat[i][j] in row i, so increment i
            if (x > mat[i][j]) {
                i++;
            }
            // If x < mat[i][j], then x will be smaller
            // than all elements to the bottom of
            // mat[i][j] in column j, so decrement j
            else if (x < mat[i][j]) {
                j--;
            }
            // If x = mat[i][j], return true
            else {
                return true;
            }
        }
        // If x was not found, return false
        System.out.println("row = " + i + ", col = " + j);
        return false;
    }
}
