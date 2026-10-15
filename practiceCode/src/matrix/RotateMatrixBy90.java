package matrix;
//https://www.geeksforgeeks.org/dsa/rotate-a-matrix-by-90-degree-in-clockwise-direction-without-using-any-extra-space/
/*        1  2  3                                 1  4  7                                         7  4  1

        4  5  6  				   —Transpose->   2  5  8     —-Reverse rows—->  				    8   5  2

        7  8  9                                    3  6  9                                         9  6  3*/
public class RotateMatrixBy90 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        rotate90(mat);

        // Print the rotated matrix
        for (int[] row : mat) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    private static void rotate90(int[][] mat) {
        int n = mat.length;
        // Perform Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}
