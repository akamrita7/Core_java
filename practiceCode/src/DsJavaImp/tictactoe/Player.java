package DsJavaImp.tictactoe;

public class Player {
    private final String id;
    private final String name;
    private final Symbol symbol;

    public Player(String id, String name, Symbol symbol) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
