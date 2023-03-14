package org.example;

import org.example.domain.Output;

public class GameApplication {
    private static Output output;

    public static void main(String[] args) {
        setGame();
        startGame();
    }

    public static void setGame() {
        output = new Output();
    }

    public static void startGame() {
        output.startGame();
    }
}