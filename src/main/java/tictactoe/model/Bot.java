package tictactoe.model;

import tictactoe.model.types.BotDifficultyLevel;
import tictactoe.model.types.PlayerType;

import java.util.Scanner;

public class Bot extends Player{
    BotDifficultyLevel botDifficultyLevel;

    public Bot(String name, Integer id, Symbol symbol,
               PlayerType type, Scanner scanner, BotDifficultyLevel botDifficultyLevel) {
        super(name, id, symbol, type, scanner);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }
}
