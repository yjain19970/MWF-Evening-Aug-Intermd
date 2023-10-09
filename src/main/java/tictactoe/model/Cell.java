package tictactoe.model;

import tictactoe.model.types.CellState;

public class Cell {
    Integer row;
    Integer col;
    CellState cellState;
    Player player;

    public Integer getRow() {
        return row;
    }

    public Integer getCol() {
        return col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public Player getPlayer() {
        return player;
    }
}
