package org.example.domain;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class TargetNumber {
    private List<Integer> numbers;

    public TargetNumber(int ballCount, int start, int end) {
        numbers = new ArrayList<>();
        while (numbers.size() < ballCount) {
            int num = pickNumberInRange(start, end);
            if (!numbers.contains(num))
                numbers.add(num);
        }
    }

    public Result compare(GuessNumber guessNumber, int ballCount) {
        Result result = new Result();
        for (int i = 0; i < ballCount; i++) {
            compare(i, guessNumber.getNumbers().get(i), result);
        }

        return result;
    }

    private void compare(int index, int guess, Result result) {
        if (!numbers.contains(guess)) {
            result.out();
            return;
        }

        if (numbers.indexOf(guess) == index) {
            result.strike();
            return;
        }

        result.ball();
    }
}
