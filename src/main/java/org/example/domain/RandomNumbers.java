package org.example.domain;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static org.example.domain.GameManager.*;

public class RandomNumbers {

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
