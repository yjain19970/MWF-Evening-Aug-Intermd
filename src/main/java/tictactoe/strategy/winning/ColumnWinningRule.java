package tictactoe.strategy.winning;

import tictactoe.model.Board;
import tictactoe.model.Move;

public class ColumnWinningRule implements GameWinningRule {
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
