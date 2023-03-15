package org.example;

import org.example.domain.GuessNumber;
import org.example.domain.TargetNumber;
import org.example.view.UIManager;

public class GameApplication {

    public static void main(String[] args) {
        UIManager uiManager = new UIManager();

        uiManager.printStartGame();
        TargetNumber targetNumber = new TargetNumber();
        GuessNumber guessNumber = new GuessNumber(uiManager.inputGuessNumbers());
    }

}