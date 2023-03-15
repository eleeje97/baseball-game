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
}
