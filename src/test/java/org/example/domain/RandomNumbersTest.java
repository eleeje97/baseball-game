package org.example.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomNumbersTest {
    @DisplayName("중복없이 3자리 수 생성되는지 테스트")
    @Test
    void 랜덤숫자_생성_테스트() {
        RandomNumbers randomNumbers = new RandomNumbers();
        List<Integer> randomNumberList = randomNumbers.getNumbers();

        Set<Integer> randomNumberSet = new HashSet<>(randomNumberList);

        Assertions.assertThat(randomNumberSet.size()).isEqualTo(3);
    }
}
