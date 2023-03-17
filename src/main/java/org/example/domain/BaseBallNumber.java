package org.example.domain;

import java.util.Objects;

import static org.example.domain.GameManager.*;

public class BaseBallNumber {
    private final int number;

    public BaseBallNumber(char userInput) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseBallNumber that = (BaseBallNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
