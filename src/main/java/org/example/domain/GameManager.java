package org.example.domain;

public class GameManager {
    private static final int BALL_COUNT = 3;

    RandomNumbers randomNumbers;
    UserNumbers userNumbers;

    public UserNumbers getUserNumbers() {
        return userNumbers;
    }

    public void setRandomNumbers() {
        randomNumbers = new RandomNumbers();
    }

    public void setUserNumbers(String userInput) {
        userNumbers = new UserNumbers(userInput);
    }

    public void compare() {
        Result result = new Result();
        for (int i = 0; i < BALL_COUNT; i++) {
            compare(i, userNumbers.getNumbers().get(i).getNumber(), result);
        }
        userNumbers.setResult(result);
    }

    private void compare(int index, int guess, Result result) {
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

    public boolean isSuccess() {
        return userNumbers.getResult().getStrike() == BALL_COUNT;
    }

    public boolean restart(String userInput) {
        if (userInput.equals("1")) {
            return true;
        }

        if (userInput.equals("2")) {
            return false;
        }

        throw new IllegalArgumentException();
    }


}
