package tictactoe.model;

import tictactoe.model.types.PlayerType;

public class Player {
    String name;
    Integer id;
    Symbol symbol;
    PlayerType type;

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerType getType() {
        return type;
    }
}
