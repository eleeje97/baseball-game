package org.example.domain;

public class Result {
    private static final int BALL_COUNT = 3;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        printOut(sb);
        printBall(sb);
        printStrike(sb);
        return sb.toString();
    }

    private void printOut(StringBuilder sb) {
        if (out == BALL_COUNT) {
            sb.append("낫싱");
        }
    }

    private void printBall(StringBuilder sb) {
        if (ball > 0) {
            sb.append(ball).append("볼 ");
        }
    }

    private void printStrike(StringBuilder sb) {
        if (strike > 0) {
            sb.append(strike).append("스트라이크");
        }
    }
}
