package tictactoe.model;

import tictactoe.model.types.CellState;
import tictactoe.model.types.GameState;
import tictactoe.model.types.PlayerType;
import tictactoe.strategy.winning.GameWinningRule;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Player> players;
    Board board;
    List<Move> playerMoves;
    Player winnerPlayer;
    GameState gameState;
    Integer nextPlayerIndex;
    List<GameWinningRule> winningRules;

    private Game(List<Player> players, int dimension,
                List<GameWinningRule> winningStrategies) {

        this.players = players;
        this.board = new Board(dimension);
        this.playerMoves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerIndex = 0;
        this.winningRules = winningStrategies;
    }

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

    public static Builder getGameBuilder(){
        return new Builder();
    }

    public void makeMove() throws Exception {
        // DS1: I need the index for player for which move has to be done
        // DS2. ask player to make a move
        // DS3. validate the move
        // DS4. update the cell on board
        // DS5. update nextPlayerTurn Index
        // S6. checkWinner

       Player currPlayer = players.get(nextPlayerIndex);

       Move currMove =  currPlayer.makeMove();

       if(!validateMove(currMove)){
           throw new Exception();
       }

        int row = currMove.getCell().getRow();
        int col = currMove.getCell().getCol();

        Cell cellToBeUpdated = getBoard().getCells()
                .get(row).get(col);
        cellToBeUpdated.setCellState(CellState.FILLED);
        cellToBeUpdated.setPlayer(currMove.getPlayer());

        currMove.setCell(cellToBeUpdated);
        playerMoves.add(currMove);

        nextPlayerIndex++;
        nextPlayerIndex %= players.size();

        if(checkWinner(board,currMove)){
            gameState = GameState.END;
            winnerPlayer = currPlayer;
        }else if(playerMoves.size() == board.getSize()*board.getSize()){
                gameState = GameState.DRAW;
        }
    }

    private boolean checkWinner(Board board, Move currMove) {
        for(GameWinningRule rule : winningRules){
            if(rule.checkWinner(board,currMove)){
                return true;
            }
        }
        return false;
    }

    private boolean validateMove(Move currMove) {
        if(currMove.getCell().getCellState().equals(CellState.FILLED)){
            return false;
        }

        int row = currMove.getCell().getRow();
        int col = currMove.getCell().getCol();

        if (row >= board.getSize()) {
            return false;
        }
        if (col >= board.getSize()) {
            return false;
        }

        return true;
    }

    public void undo() {
    }

    public void printBoard() {
        board.printBoard();
    }

    // players: n-1
    // bots : all players should not be bots

    public static class Builder{
        private List<Player> players;
        private List<GameWinningRule> winningStrategies;
        private int dimension;

        private Builder() {
            this.players = new ArrayList<>();
            this.winningStrategies = new ArrayList<>();
            this.dimension = 0;
        }


        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        public Builder setWinningStrategies(List<GameWinningRule> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
        public Game build() throws Exception {
            validate();

            return new Game(players,
                    dimension,
                    winningStrategies);
        }

        public void validate() throws Exception {
            validateForBotCount();
            validateForNumberOfPlayers();
        }

        private void validateForNumberOfPlayers() throws Exception {
            if(players.size() == dimension){
                throw new Exception();
            }
        }

        private void validateForBotCount() throws Exception {
            int botCount=0;

            for(Player p : players){
                if(p.getType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }

            if(botCount == players.size()){
                throw new Exception();
            }
        }
    }







}
