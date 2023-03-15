package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class GuessNumber {
    private List<Integer> numbers;

    public GuessNumber(String userInput) {
        if (!validate(userInput)) {
            throw new IllegalArgumentException();
        }
        numbers = new ArrayList<>();
        for (char c : userInput.toCharArray()) {
            numbers.add(Integer.parseInt(String.valueOf(c)));
        }
    }

    private boolean validate(String userInput) {
        return isThree(userInput);
    }

    private boolean isThree(String userInput) {
        return userInput.length() == 3;
    }

}
