package org.example.domain;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomNumbers {
    private static final int BALL_COUNT = 3;
    private static final int RANGE_START = 1;
    private static final int RANGE_END = 9;

    private final List<Integer> numbers;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public RandomNumbers() {
        numbers = new ArrayList<>();
        while (numbers.size() < BALL_COUNT) {
            int num = pickNumberInRange(RANGE_START, RANGE_END);
            addNumber(num);
        }
    }

    private void addNumber(int number) {
        if (!numbers.contains(number))
            numbers.add(number);
    }

}
