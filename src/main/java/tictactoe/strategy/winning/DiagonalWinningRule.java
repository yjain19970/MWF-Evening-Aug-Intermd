package tictactoe.strategy.winning;

import tictactoe.model.Board;
import tictactoe.model.Move;

public class DiagonalWinningRule implements GameWinningRule{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
        //HW
    }

    @Override
    public void handleUndo( Move move) {

    }
}
