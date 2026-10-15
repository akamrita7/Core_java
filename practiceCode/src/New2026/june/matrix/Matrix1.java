package New2026.june.matrix;

public class Matrix1 {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 2, 7, 8 },
                { 9, 2, 11, 12 } };
        print2D(mat);
    }

    private static void print2D(int[][] mat) {
        int col = mat.length , row = mat[0].length ;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j <row ; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
