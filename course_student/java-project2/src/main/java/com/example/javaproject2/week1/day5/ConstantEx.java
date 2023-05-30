package com.example.javaproject2.week1.day5;

import com.example.javaproject2.week1.PrintHello;

public class ConstantEx {
    // 상수를 대문자_언더바 형식
    public final int MAX_LEVEL = 3; // 인스턴스화해야 다른 파일에서도 쓸 수 있음
    public static final int MIN_LEVEL = 1; // 인스턴스화하지 않아도 어디서든 쓸 수 있음
    public static void main(String[] args) {
        final int iVal;
        // 메소드 안에 있는 상수라서 대문자 언더바 안써도
        iVal = 1;
        System.out.println(iVal);

        final PrintHello printHello = new PrintHello(); // 객체가 바뀌면 안되서 final 붙이기


    }
}
