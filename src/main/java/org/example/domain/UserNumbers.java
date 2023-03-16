package org.example.domain;

import java.util.ArrayList;
import java.util.List;

import static org.example.domain.GameManager.*;

public class UserNumbers {
    private final List<Number> numbers;
    private Result result;

    public UserNumbers(String userInput) {
        if (!checkBallCount(userInput)) {
            throw new IllegalArgumentException();
        }
        numbers = new ArrayList<>();
        for (char c : userInput.toCharArray()) {
            addNumber(new Number(c));
        }
    }

    public Result getResult() {
        return result;
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

    public void compare(RandomNumbers randomNumbers) {
        result = new Result();
        for (int i = 0; i < BALL_COUNT; i++) {
            compare(i, numbers.get(i).getNumber(), randomNumbers);
        }
    }

    private void compare(int index, int guess, RandomNumbers randomNumbers) {
        if (!randomNumbers.getNumbers().contains(guess)) {
            result.out();
            return;
        }

        if (randomNumbers.getNumbers().indexOf(guess) == index) {
            result.strike();
            return;
        }

        result.ball();
    }
}
