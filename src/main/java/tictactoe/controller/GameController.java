package tictactoe.controller;

import tictactoe.model.Game;
import tictactoe.model.Player;
import tictactoe.model.types.GameState;
import tictactoe.strategy.winning.GameWinningRule;

import java.util.List;

public class GameController {
    public void makeMove(Game game) throws Exception {
        game.makeMove();
    }

    public void undo(Game game) throws Exception {
        game.undo();
    }

    // when user wants to start game.
    public Game startGame(List<Player> players,
                          List<GameWinningRule> winningRules,
                          Integer dimension) throws Exception {
        return Game.getGameBuilder()
                .setPlayers(players)
                .setDimension(dimension)
                .setWinningStrategies(winningRules)
                .build();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public Player getWinner(Game game){
        return game.getWinnerPlayer();
    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }
}
