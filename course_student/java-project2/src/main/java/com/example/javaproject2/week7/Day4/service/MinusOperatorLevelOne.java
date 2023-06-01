package com.example.javaproject2.week7.Day4.service;

public class MinusOperatorLevelOne implements IOperator{
    int a, b;

    @Override
    public void setA(int i) {
        this.a = a;
    }

    @Override
    public void setB(int i) {
        this.b = b;
    }

    @Override
    public void generateQuestion(int max) {
        int a = (int) (Math.random() * max);
        int b = (int) (Math.random() * (max));
        if (a < b) {
            int tmp = b;
            a = b;
            b = tmp;
        }
    }

    @Override
    public String getQuestionMsg() {
        return String.format("%d - %d = ", a, b);
    }

    @Override
    public boolean isEquals(int answer) {
        return (a - b) == answer;
    }
}
