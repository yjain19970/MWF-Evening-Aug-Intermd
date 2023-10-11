package tictactoe.model;

import tictactoe.model.types.PlayerType;

public class Player {
    String name;
    Integer id;
    Symbol symbol;
    PlayerType type;

    public Player(String name, Integer id, Symbol symbol, PlayerType type) {
        this.name = name;
        this.id = id;
        this.symbol = symbol;
        this.type = type;
    }

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
