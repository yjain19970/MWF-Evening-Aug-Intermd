package tictactoe.strategy.winning;

import tictactoe.model.Board;
import tictactoe.model.Move;
import tictactoe.model.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningRule implements GameWinningRule{
    private final Map<Symbol, Integer> diagCount = new HashMap<>();

    private final Map<Symbol, Integer> antiDiagCount = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        //S1: take the row and col and playerSymbol
        //S2: check if the row and col comes under diag or antiDiag
        //s3: check whether playerSymbol is existed other add the player symbol and count

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol playerSymbol = move.getPlayer().getSymbol();

        //condition to check diagonal
        if(row == col) {
            if(!diagCount.containsKey(playerSymbol)) {
                diagCount.put(playerSymbol, 0);
            }
            diagCount.put(playerSymbol, diagCount.get(playerSymbol)+1);

            if(diagCount.get(playerSymbol).equals(board.getSize())) {
                return true;
            }
        }


        //condition to check antiDiagonal
        if(row+col == board.getSize()-1) {
            if(!antiDiagCount.containsKey(playerSymbol)) {
                antiDiagCount.put(playerSymbol, 0);
            }
            antiDiagCount.put(playerSymbol, antiDiagCount.get(playerSymbol)+1);

            if(antiDiagCount.get(playerSymbol).equals(board.getSize())) {
                return true;
            }
        }

        return false;
        //HW
    }

    @Override
    public void handleUndo( Move move) {

    }
}
