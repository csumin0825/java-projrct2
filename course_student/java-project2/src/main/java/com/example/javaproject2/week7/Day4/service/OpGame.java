package com.example.javaproject2.week7.Day4.service;

public class OpGame {
    int remainingAnswers;
    int a, b;
    String cheeringUpMsg = "한번 더 해보자";

    public OpGame(PlusOperatorLevelOne plusOperatorLevelOne) {

    }

    public void makeQuestion() {
        remainingAnswers = 3;
        a = 1;
        b = 1;
    }

    public void makeQuestion(int max) {
        a = (int) (Math.random() * max);
        b = (int) (Math.random() * (max - a));
    }

    public String getQuestion() {
        return String.format("%d + %d = ", a, b);
    }

    public int getRemainingAnswers() {
        return remainingAnswers;
    }

    public boolean isAnswer(int answer) {
        remainingAnswers--;
        return (a + b) == answer;
    }

    public String getCheeringUpMsg() {
        return cheeringUpMsg;
    }


}
