package DsJavaImp.tictactoe;

public class TicTacToeApp {

    public static void main(String[] args) {

        Player p1 = new Player("1", "Alice", Symbol.X);
        Player p2 = new Player("2", "Bob", Symbol.O);

        Game game = new Game(3, p1, p2);

        game.makeMove(0, 0);
        game.makeMove(0, 1);
        game.makeMove(1, 1);
        game.makeMove(0, 2);
        game.makeMove(2, 2);
    }
}
