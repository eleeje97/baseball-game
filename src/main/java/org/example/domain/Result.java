package org.example.domain;

public class Result {
    private int strike;
    private int ball;
    private int out;

    public Result() {
        strike = 0;
        ball = 0;
        out = 0;
    }

    public void strike() {
        strike++;
    }

    public void ball() {
        ball++;
    }

    public void out() {
        out++;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public int getOut() {
        return out;
    }

    // TODO: 결과 출력 수정
    @Override
    public String toString() {
        return "Result{" +
                "strike=" + strike +
                ", ball=" + ball +
                ", out=" + out +
                '}';
    }
}
