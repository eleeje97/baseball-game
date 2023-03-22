package org.example.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumbersTest {
    @DisplayName("중복없이 생성되는지 테스트")
    @Test
    void 랜덤숫자_생성_테스트_중복() {
        // Given & When
        RandomNumbersInterface randomNumbers = new RandomNumbers();

        // Then
        assertThat(isNotExistsSameNumbers(randomNumbers.getNumbers())).isTrue();
    }

    @DisplayName("3자리 수 생성되는지 테스트")
    @Test
    void 랜덤숫자_생성_테스트_자릿수() {
        // Given & When
        RandomNumbersInterface randomNumbers = new RandomNumbers();

        // Then
        assertThat(hasThreeNumbers(randomNumbers.getNumbers())).isTrue();
    }


    private boolean isNotExistsSameNumbers(List<Integer> numbers) {
        Set<Integer> randomNumberSet = new HashSet<>(numbers);
        return randomNumberSet.size() == numbers.size();
    }

    private boolean hasThreeNumbers(List<Integer> numbers) {
        return numbers.size() == 3;
    }
}
