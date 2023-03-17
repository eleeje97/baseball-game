package org.example.view;

import org.example.domain.GameManager;
import org.example.domain.Result;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static org.example.domain.GameManager.*;

public class UIManager {
    public void printStartGame() {
        System.out.println("##### Game Start #####");
    }

    public String inputUserNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        return readLine();
    }

    public void printResult(GameManager gameManager) {
        Result result = gameManager.getResult();
        System.out.println(result);
    }

    public void printEndGame() {
        System.out.println(BALL_COUNT + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public String inputRestartGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return readLine();
    }

}
