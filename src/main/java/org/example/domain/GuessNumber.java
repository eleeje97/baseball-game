package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class GuessNumber {

    private List<Integer> numbers;

    public GuessNumber(String userInput, int ballCount) {
        if (!validate(userInput, ballCount)) {
            throw new IllegalArgumentException();
        }
        numbers = new ArrayList<>();
        for (char c : userInput.toCharArray()) {
            numbers.add(Integer.parseInt(String.valueOf(c)));
        }
    }

    private boolean validate(String userInput, int ballCount) {
        return checkBallCount(userInput, ballCount) && isDigit(userInput);
    }

    private boolean checkBallCount(String userInput, int ballCount) {
        return userInput.length() == ballCount;
    }

    private boolean isDigit(String userInput) {
        for (char c : userInput.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

}
