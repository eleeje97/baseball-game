package org.example.domain;

public class Number {
    private static final int RANGE_START = 1;
    private static final int RANGE_END = 9;

    private int number;

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
