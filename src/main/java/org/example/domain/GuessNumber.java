package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class GuessNumber {

    private List<Integer> numbers;

    public GuessNumber(String userInput, int ballCount, int rangeStart, int rangeEnd) {
        if (!validate(userInput, ballCount, rangeStart, rangeEnd)) {
            throw new IllegalArgumentException();
        }
        numbers = new ArrayList<>();
        for (char c : userInput.toCharArray()) {
            numbers.add(Integer.parseInt(String.valueOf(c)));
        }
    }

    private boolean validate(String userInput, int ballCount, int start, int end) {
        return checkBallCount(userInput, ballCount) && isDigit(userInput) && isBetween(userInput, start, end);
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

    private boolean isBetween(String userInput, int start, int end) {
        for (char c : userInput.toCharArray()) {
            int num = Integer.parseInt(String.valueOf(c));
            if (!(num >= start && num <= end)) {
                return false;
            }
        }
        return true;
    }

}
