package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class MockRandomNumbers implements RandomNumbersInterface {
    private final List<Integer> numbers;

    public MockRandomNumbers() {
        numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(7);
    }

    @Override
    public List<Integer> getNumbers() {
        return numbers;
    }
}
