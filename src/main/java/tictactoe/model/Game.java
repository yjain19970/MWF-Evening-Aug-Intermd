package tictactoe.model;

import tictactoe.model.types.GameState;

import java.util.List;

public class Game {
    List<Player> players;
    Board board;
    List<Move> playerMoves;
    Player winnerPlayer;
    GameState gameState;
    Integer nextPlayerIndex;

    public List<Player> getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public List<Move> getPlayerMoves() {
        return playerMoves;
    }

    public Player getWinnerPlayer() {
        return winnerPlayer;
    }

    public GameState getGameState() {
        return gameState;
    }

    public Integer getNextPlayerIndex() {
        return nextPlayerIndex;
    }
    /*
        DEFINE BUILDER FOR GAME.
     */
}
