package tictactoe.strategy.winning;

import tictactoe.model.Board;
import tictactoe.model.Move;

public interface GameWinningRule {

    boolean checkWinner(Board board, Move move);
}
