package com.example.javaproject2.week1.day5;

public class SpaceInvadersMemberVariable {
    int location; // 멤버변수

    public void moveLeft(){
        location = location -1; // 초기화하지 않아도 기본값이 0으로 작동
        System.out.printf("moveLeft : %d\n", location);
    }

    public void moveRight(){
        location = location +1;
        System.out.printf("moveRight : %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();

        simv.moveLeft();
        simv.moveLeft();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();

    }
}
