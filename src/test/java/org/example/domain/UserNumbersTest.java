package org.example.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class UserNumbersTest {
    @DisplayName("세자리수가 아닐 때 예외처리 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"1234", "1", "", " "})
    void 입력값_길이체크_테스트(String userInput) {
        assertThatThrownBy(() -> {
            new UserNumbers(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("중복된 수가 있을 때 예외처리 테스트")
    @Test
    void 입력값_중복체크_테스트() {
        assertThatThrownBy(() -> {
            new UserNumbers("373");
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("볼, 스트라이크 개수 카운트 테스트")
    @Test
    void 랜덤숫자와_사용자숫자_비교_테스트() {
        RandomNumbers randomNumbers = new RandomNumbers();
        List<Integer> randomNumberList = randomNumbers.getNumbers();

        String userInput = randomNumberList.get(1) +
                String.valueOf(randomNumberList.get(0)) +
                randomNumberList.get(2);
        UserNumbers userNumbers = new UserNumbers(userInput);

        userNumbers.compareTo(randomNumbers);
        Result result = userNumbers.getResult();

        assertThat(result.toString()).isEqualTo("2볼 1스트라이크");
    }
}
