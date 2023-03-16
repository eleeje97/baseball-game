package org.example;

import org.example.domain.GameManager;
import org.example.view.UIManager;

public class GameApplication {
    public static void main(String[] args) {
        playBaseBallGame();
    }

    public static void playBaseBallGame() {
        UIManager uiManager = new UIManager();
        GameManager gameManager = new GameManager();

        // 게임 시작
        uiManager.printStartGame();

        // 사용자 입력, 비교, 결과출력
        boolean isSuccess = false;
        while (!isSuccess) {
            gameManager.setUserNumbers(uiManager.inputUserNumbers());
            gameManager.compare();
            uiManager.printResult(gameManager);
            isSuccess = gameManager.isSuccess();
        }

        // 게임 종료
        uiManager.printEndGame();
        if (gameManager.restart(uiManager.inputRestartGame())) {
            GameApplication.playBaseBallGame();
        }
    }

}