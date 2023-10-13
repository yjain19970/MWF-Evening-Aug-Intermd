package tictactoe.strategy.winning;

import tictactoe.model.Board;
import tictactoe.model.Move;
import tictactoe.model.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningRule implements GameWinningRule {
    private final Map<Integer, HashMap<Symbol, Integer>> rowCount = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        if(!rowCount.containsKey(row)){
            rowCount.put(row, new HashMap<>());
        }

        Map<Symbol,Integer> symbol = rowCount.get(row);
        Symbol playerSymbol = move.getPlayer().getSymbol();

        if(!symbol.containsKey(playerSymbol)){
            symbol.put(playerSymbol, 0);
        }

        symbol.put(playerSymbol, symbol.get(playerSymbol)+1); //update

        if (symbol.get(playerSymbol).equals(board.getSize())) {
            return true;
        }

        return false;
    }

    @Override
    public void handleUndo(Move move) {
        int row = move.getCell().getRow();

        Map<Symbol,Integer> symbol = rowCount.get(row);
        Symbol playerSymbol = move.getPlayer().getSymbol();

        symbol.put(playerSymbol, symbol.get(playerSymbol)-1); //update
    }
}
