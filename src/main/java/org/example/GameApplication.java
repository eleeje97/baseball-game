package org.example;

import org.example.domain.GuessNumber;
import org.example.domain.Result;
import org.example.domain.TargetNumber;
import org.example.view.UIManager;

public class GameApplication {
    public static void main(String[] args) {
        final int BALL_COUNT = 3;
        final int RANGE_START = 1;
        final int RANGE_END = 9;

        UIManager uiManager = new UIManager();

        uiManager.printStartGame();
        TargetNumber targetNumber = new TargetNumber(BALL_COUNT, RANGE_START, RANGE_END);
        GuessNumber guessNumber = new GuessNumber(uiManager.inputGuessNumbers(), BALL_COUNT, RANGE_START, RANGE_END);
        Result result = targetNumber.compare(guessNumber, BALL_COUNT);
    }

}