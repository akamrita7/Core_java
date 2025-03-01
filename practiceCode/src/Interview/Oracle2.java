package Interview;

import java.util.ArrayList;
import java.util.List;

/*1 2 3 4
        5 6 7 8
        9 10 11 12*/
//        1 2 3 4 8 12 11 10 9 5 6 7
public class Oracle2 {
    public static void main(String[] args) {
        int[][] arr = {{1 ,2 ,3 ,4},{5 ,6 ,7 ,8},{9 ,10 ,11 ,12}};
        transverseMatrix(arr);
    }

    private static void transverseMatrix(int[][] arr) {
        int len = arr.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int innerLen = arr[i].length;
            for (int j = 0; j < innerLen; j++) {
                list.add(arr[i][j]);

            }

        }
    }
}
