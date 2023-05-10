package com.example.javaproject2.week4.day3.interfacePractice2;

import java.io.IOException;

public class HelloPrinter_4 {
    // 파일에도 저장하고싶고
    // 콘솔에도 출력하고 싶다
    Printer2 printer = new ConsolePrinter();

//    public void print(String message){
//        System.out.println(message);
//    }

    // 기능1 추가
    // n을 받아서 반복하는 메서드
    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }

    public static void main(String[] args) throws IOException {
        HelloPrinter_4 hp = new HelloPrinter_4(); // 인스턴스 생성
        hp.repeatMessage(5, "Hello"); // 호출
        hp.repeatMessage(5, "Bye");
    }
}
