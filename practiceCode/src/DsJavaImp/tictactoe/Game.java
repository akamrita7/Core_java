package DsJavaImp.tictactoe;

public class Game {

    private final Board board;
    private final Player[] players;
    private int currentPlayerIndex;
    private int totalMoves;
    private final int maxMoves;
    private GameStatus status;
    private Player winner;

    public Game(int size, Player p1, Player p2) {
        this.board = new Board(size);
        this.players = new Player[]{p1, p2};
        this.currentPlayerIndex = 0;
        this.totalMoves = 0;
        this.maxMoves = size * size;
        this.status = GameStatus.IN_PROGRESS;
    }

    public void makeMove(int row, int col) {

        if (status != GameStatus.IN_PROGRESS) {
            throw new IllegalStateException("Game already finished");
        }

        Player currentPlayer = players[currentPlayerIndex];

        boolean isWin = board.makeMove(row, col, currentPlayer.getSymbol());
        totalMoves++;

        if (isWin) {
            status = GameStatus.WIN;
            winner = currentPlayer;
            System.out.println("Winner is: " + winner.getName());
        } else if (totalMoves == maxMoves) {
            status = GameStatus.DRAW;
            System.out.println("Game Draw!");
        } else {
            switchPlayer();
        }

        board.printBoard();
    }

    private void switchPlayer() {
        currentPlayerIndex = 1 - currentPlayerIndex;
    }
}
