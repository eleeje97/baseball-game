package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class UserNumbers {
    private static final int BALL_COUNT = 3;

    private final List<Number> numbers;
    private Result result;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public List<Number> getNumbers() {
        return numbers;
    }

    public UserNumbers(String userInput) {
        if (!checkBallCount(userInput)) {
            throw new IllegalArgumentException();
        }
        numbers = new ArrayList<>();
        for (char c : userInput.toCharArray()) {
            addNumber(new Number(c));
        }
    }


    private boolean checkBallCount(String userInput) {
        return userInput.length() == BALL_COUNT;
    }

    private void addNumber(Number number) {
        if (!checkDuplication(number)) {
            throw new IllegalArgumentException();
        }
        numbers.add(number);
    }
    private boolean checkDuplication(Number number) {
        return !numbers.contains(number);
    }
}
