package graph;

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = { { '1', '1', '0', '0', '0' },
                { '0', '1', '0', '0', '1' },
                { '1', '0', '0', '1', '1' },
                { '0', '0', '0', '0', '0' },
                { '1', '0', '1', '1', '0' } };

        System.out.println(numIslands(grid));
    }

    private static int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for (int r = 0; r < row; ++r) {
            for (int c = 0; c < col; ++c) {
                if (grid[r][c] == '1') {
                    dfs(grid, r, c);
                    ++count;
                }
            }
        }
        return count;

    }

    private static void dfs(char[][] grid, int r, int c) {
        int[] rNbr = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] cNbr = { -1,  0,  1, -1, 1, -1, 0, 1 };
        grid[r][c] = '0';
        for (int k = 0; k < 8; ++k) {
            int newR = r + rNbr[k];
            int newC = c + cNbr[k];
            if (isSafe(grid, newR, newC)) {
                dfs(grid, newR, newC);
            }
        }
    }

    private static boolean isSafe(char[][] grid, int r, int c) {
        int row = grid.length;
        int col = grid[0].length;
        return (r >= 0) && (r < row) && (c >= 0) &&
                (c < col) && grid[r][c] == '1';
    }
}
