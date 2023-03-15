package org.example.view;

import org.example.domain.GameManager;
import org.example.domain.Result;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class UIManager {
    public void printStartGame() {
        System.out.println("##### Game Start #####");
    }

    public String inputUserNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        return readLine();
    }

    public void printResult(GameManager gameManager) {
        Result result = gameManager.getUserNumbers().getResult();
        System.out.println(result);
    }

}
