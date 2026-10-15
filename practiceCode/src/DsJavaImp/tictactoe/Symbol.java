package DsJavaImp.tictactoe;

public enum Symbol {
    X(1),
    O(-1);

    private final int value;

    Symbol(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
