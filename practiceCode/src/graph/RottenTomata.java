package graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenTomata {
    static int orangesRotting(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] directions = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(mat[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        int timeTaken = 0;
        while (!q.isEmpty()){
            timeTaken++;
            int len = q.size();
            while (len-- > 0){
                int[] cur = q.poll();
                int i = cur[0];
                int j = cur[1];
                for (int[] dir : directions) {
                    int x = i + dir[0];
                    int y = j + dir[1];
                    if(issafe(x,y,n,m) && mat[x][y] == 1) {
                        mat[x][y] = 2;
                        q.add(new int[]{x, y});
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    return -1;
                }
            }
        }
        return Math.max(0,timeTaken-1);
    }
    private static boolean issafe(int i, int j, int n, int m) {
        return (i>=0 && i<m && j>=0 && j<m);
    }

    public static void main(String[] args) {
        int[][] mat = { { 0, 1, 2 },
                { 0, 1, 2 },
                { 2, 1, 1 } };
        System.out.println(orangesRotting(mat));
    }
}
