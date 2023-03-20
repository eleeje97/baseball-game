package org.example.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GameManagerTest {
    GameManager gameManager;

    @BeforeEach
    void setUp() {
        gameManager = new GameManager();
    }

    @DisplayName("다시시작여부 입력 테스트")
    @Test
    void 다시시작_다른입력_테스트() {
        assertThatThrownBy(() -> {
            gameManager.restart("3");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
