package tictactoe.strategy.winning;

import tictactoe.model.Board;
import tictactoe.model.Move;

public class RowWinningRule implements GameWinningRule {
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
