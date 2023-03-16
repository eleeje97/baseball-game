package org.example.domain;

public class GameManager {
    public static final int BALL_COUNT = 3;
    public static final int RANGE_START = 1;
    public static final int RANGE_END = 9;

    private RandomNumbers randomNumbers;
    private UserNumbers userNumbers;

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
        userNumbers.compare(randomNumbers);
    }

    public boolean isSuccess() {
        return userNumbers.getResult().isSuccess();
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
