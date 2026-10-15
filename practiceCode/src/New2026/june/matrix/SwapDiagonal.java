package New2026.june.matrix;

public class SwapDiagonal {
    public static void main(String[] args) {
        int[][] mat = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        swapDiagonal1(mat);
        for (int[] row : mat){
            for (int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void swapDiagonal1(int[][] mat) {
        int size = mat.length;
        for (int i = 0; i < size; i++) {
            // Swap major and minor diagonal elements
            int temp = mat[i][i];
            mat[i][i] = mat[i][size - i - 1];
            mat[i][size - i - 1] = temp;
        }
    }


    private static void swapDiagonal(int[][] mat) {
        int size = mat.length;
        int[] majorDia =  new int[size];
        int[] minorDia =  new int[size];
        for (int i = 0; i < size; i++) {
            majorDia[i] = mat[i][i];
            minorDia[i] = mat[i][size-i-1];
        }
        for (int i = 0; i < size; i++) {
            mat[i][i] = minorDia[i];
            mat[i][size-i-1] = majorDia[i];
        }
    }
}
