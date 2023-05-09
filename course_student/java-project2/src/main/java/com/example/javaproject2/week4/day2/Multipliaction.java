package com.example.javaproject2.week4.day2;

public class Multipliaction {
    private String multipleSymbol;  // 멤버변수는 private으로 선언하는 게 좋다.

    public Multipliaction(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    public void printDan(int dan) {
        for (int i = 0; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, i, dan * i);
        }
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        // 2, 5, 7, 8
        Multipliaction mt = new Multipliaction("x");
        mt.printDan(2);
        mt.printDan(5);
        Multipliaction mt2 = new Multipliaction("*");
        mt2.printDan(7);
        mt2.printDan(8);

    }
}
