package org.example.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class BaseBallNumberTest {
    @DisplayName("숫자가 아닌 입력값이 들어왔을 때 예외처리 테스트")
    @ParameterizedTest
    @ValueSource(chars = {'a', ' '})
    void 입력값_숫자체크_테스트(char userInput) {
        assertThatThrownBy(() -> {
            new BaseBallNumber(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("입력한 수가 범위를 벗어났을 때 예외처리 테스트")
    @Test
    void 입력값_범위체크_테스트() {
        assertThatThrownBy(() -> {
            new BaseBallNumber('0');
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("number를 기준으로 객체비교 테스트")
    @Test
    void 객체비교_테스트() {
        BaseBallNumber baseBallNumber = new BaseBallNumber('1');

        assertThat(baseBallNumber).isEqualTo(new BaseBallNumber('1'));
    }
}
