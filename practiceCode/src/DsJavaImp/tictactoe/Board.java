package DsJavaImp.tictactoe;

public class Board {

    private final int size;
    private final Symbol[][] grid;
    private final int[] rows;
    private final int[] cols;
    private int diagonal;
    private int antiDiagonal;

    public Board(int size) {
        this.size = size;
        this.grid = new Symbol[size][size];
        this.rows = new int[size];
        this.cols = new int[size];
        this.diagonal = 0;
        this.antiDiagonal = 0;
    }

    public boolean isCellEmpty(int row, int col) {
        return grid[row][col] == null;
    }

    public boolean makeMove(int row, int col, Symbol symbol) {
        if (!isCellEmpty(row, col)) {
            throw new IllegalArgumentException("Cell already occupied");
        }

        grid[row][col] = symbol;

        int value = symbol.getValue();

        rows[row] += value;
        cols[col] += value;

        if (row == col) {
            diagonal += value;
        }

        if (row + col == size - 1) {
            antiDiagonal += value;
        }

        return Math.abs(rows[row]) == size ||
                Math.abs(cols[col]) == size ||
                Math.abs(diagonal) == size ||
                Math.abs(antiDiagonal) == size;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == null) {
                    System.out.print("- ");
                } else {
                    System.out.print(grid[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
