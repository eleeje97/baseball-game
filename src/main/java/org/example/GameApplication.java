package org.example;

import org.example.domain.Output;
import org.example.domain.TargetNumber;

public class GameApplication {
    private static Output output;
    private static TargetNumber targetNumber;

    public static void main(String[] args) {
        setGame();
        startGame();
    }

    public static void setGame() {
        output = new Output();
    }

    public static void startGame() {
        output.startGame();
        targetNumber = new TargetNumber();
    }
}