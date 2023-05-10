package com.example.javaproject2.week4.day2;

public abstract class ShapeDrawer { // 추상 메소드를 1개라도 가지고 있으면 추상 클래스
    public void printShape(int height) { // 공통으로 쓸 수 있음
        for (int i = 0; i < height; i++) {
            System.out.printf(makeALine(height, i));
        }
    }

    public abstract String makeALine(int h, int i); // 추상메소드 : 구현을 해줘야힘
}
