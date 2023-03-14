package org.example.domain;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class TargetNumber {
    private List<Integer> numbers;

    public TargetNumber() {
        numbers = new ArrayList<>();
        while (numbers.size() < 3) {
            int num = pickNumberInRange(1, 9);
            if (!numbers.contains(num))
                numbers.add(num);
        }
    }
}
