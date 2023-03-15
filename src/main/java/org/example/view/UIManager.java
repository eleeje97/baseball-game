package org.example.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class UIManager {
    public void printStartGame() {
        System.out.println("##### Game Start #####");
    }

    public String inputGuessNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        return readLine();
    }
}
