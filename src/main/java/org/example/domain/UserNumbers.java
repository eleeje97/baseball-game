package org.example.domain;

import java.util.ArrayList;
import java.util.List;

import static org.example.domain.GameManager.*;

public class UserNumbers {
    private final List<BaseBallNumber> baseBallNumbers;
    private Result result;

    public UserNumbers(String userInput) {
        if (!checkBallCount(userInput)) {
            throw new IllegalArgumentException();
        }
        baseBallNumbers = new ArrayList<>();
        for (char c : userInput.toCharArray()) {
            addNumber(new BaseBallNumber(c));
        }
    }

    public Result getResult() {
        return result;
    }

    private boolean checkBallCount(String userInput) {
        return userInput.length() == BALL_COUNT;
    }

    private void addNumber(BaseBallNumber baseBallNumber) {
        if (!checkDuplication(baseBallNumber)) {
            throw new IllegalArgumentException();
        }
        baseBallNumbers.add(baseBallNumber);
    }

    private boolean checkDuplication(BaseBallNumber baseBallNumber) {
        return !baseBallNumbers.contains(baseBallNumber);
    }

    public void compareTo(RandomNumbersInterface randomNumbers) {
        result = new Result();
        for (int i = 0; i < BALL_COUNT; i++) {
            checkBallOrStrike(i, baseBallNumbers.get(i).getNumber(), randomNumbers);
        }
    }

    private void checkBallOrStrike(int index, int guess, RandomNumbersInterface randomNumbers) {
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
