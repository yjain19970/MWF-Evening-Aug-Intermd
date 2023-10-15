package tictactoe.strategy.winning;

import tictactoe.model.Board;
import tictactoe.model.Move;
import tictactoe.model.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningRule implements GameWinningRule {

    private final Map<Integer, HashMap<Symbol, Integer>> colCount = new HashMap<>();
    /**
     * Map<ColumnNo, Map<Symbol,Int>>
     * {
     *     <C1, <Symbol,Count>>
     *     <C2, <Symbol,Count>>
     *     <C3, <Symbol,Count>>
     * }
     *
     *
     * @param board
     * @param move
     * @return
     */


    @Override
    public boolean checkWinner(Board board, Move move) {
        int col = move.getCell().getCol();

        if(!colCount.containsKey(col)){
            colCount.put(col, new HashMap<>());
        }

        Map<Symbol,Integer> symbol = colCount.get(col);
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
    public void handleUndo( Move move) {
        int col = move.getCell().getCol();

        Map<Symbol,Integer> symbol = colCount.get(col);
        Symbol playerSymbol = move.getPlayer().getSymbol();

        symbol.put(playerSymbol, symbol.get(playerSymbol)-1); //update
    }
}
