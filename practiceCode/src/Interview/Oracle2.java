package Interview;

import java.util.ArrayList;
import java.util.List;
//spiral transverse matrix
/*1 2 3 4
        5 6 7 8
        9 10 11 12*/
//        1 2 3 4 8 12 11 10 9 5 6 7
public class Oracle2 {
    public static void main(String[] args) {
        int[][] arr = {{1 ,2 ,3 ,4},
                       {5 ,6 ,7 ,8},
                       {9 ,10 ,11 ,12}};
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        transverseMatrix(arr);
        System.out.println();
        transverseMatrix(matrix);
    }

    private static void transverseMatrix(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int j = left; j <= right; j++)
                System.out.print(matrix[top][j] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(matrix[i][right] + " ");
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--)
                    System.out.print(matrix[bottom][j] + " ");
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
    }
}
