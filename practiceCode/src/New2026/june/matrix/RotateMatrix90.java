package New2026.june.matrix;
//https://www.geeksforgeeks.org/dsa/rotate-matrix-90-degree-without-using-extra-space-set-2/
public class RotateMatrix90 {
    static int[][] rotateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        // Create a result matrix of size n x m
        int[][] res = new int[n][m];
        // Move mat[i][j] to res[j][m - i - 1]
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][m - i - 1] = mat[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[][] res = rotateMatrix(mat);
        for (int[] row : res) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    static int[][] rotateMatrix1(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] res = new int[n][m];
        // Transpose the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][i] = mat[i][j];
            }
        }
        // Reverse each column (not row) of the result which is a n x m matrix
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n / 2; i++) {
                int temp = res[i][j];
                res[i][j] = res[n - i - 1][j];
                res[n - i - 1][j] = temp;
            }
        }
        return res;
    }
}
