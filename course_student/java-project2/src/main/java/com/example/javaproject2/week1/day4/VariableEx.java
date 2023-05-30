package com.example.javaproject2.week1.day4;

import com.example.javaproject2.week1.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal;
        iVal = 0; // 최초로 값을 지정하는 것을 초기화
        PrintHello printHello; // 변수 선언
        printHello = new PrintHello();

        printHello.print();
        System.out.println(iVal);

    }
}
