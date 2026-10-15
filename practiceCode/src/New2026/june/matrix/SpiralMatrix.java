package New2026.june.matrix;

import java.util.ArrayList;
//https://www.geeksforgeeks.org/dsa/print-a-given-matrix-in-spiral-form/
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        ArrayList<Integer> res = spirallyTraverse(mat);
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }

    private static ArrayList<Integer> spirallyTraverse(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int left = 0 , right = n-1 , top = 0 , bottom = m-1;
        ArrayList<Integer> res = new ArrayList<>();
        while (left<=right && top <= bottom){
            for (int i = left; i <= right; i++) {
              res.add(mat[top][i]);
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                res.add(mat[i][right]);
            }
            right--;
            if (top<=bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(mat[bottom][i]);
                }
                bottom--;
            }
            if (left<=right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(mat[i][left]);
                }
                left++;
            }
        }
        return res;
        //1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
        //1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
    }
}
