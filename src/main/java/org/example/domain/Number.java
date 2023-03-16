package org.example.domain;

import static org.example.domain.GameManager.*;

public class Number {
    private final int number;

    public Number(char userInput) {
        int number = convertToDigit(userInput);
        checkRange(number);
        this.number = number;
    }

    private int convertToDigit(char userInput) {
        if (!Character.isDigit(userInput)) {
            throw new IllegalArgumentException();
        }

        return Integer.parseInt(String.valueOf(userInput));
    }

    private void checkRange(int number) {
        if (!(number >= RANGE_START && number <= RANGE_END)) {
            throw new IllegalArgumentException();
        }
    }

    public int getNumber() {
        return number;
    }
}
