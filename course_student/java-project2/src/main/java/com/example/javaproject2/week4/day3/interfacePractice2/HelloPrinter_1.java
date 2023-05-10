package com.example.javaproject2.week4.day3.interfacePractice2;

public class HelloPrinter_1 {
    // 파일에도 저장하고싶고
    // 콘솔에도 출력하고 싶다

    public void print(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        HelloPrinter_1 hp = new HelloPrinter_1();
        hp.print("Hello");
        hp.print("Bye");
    }
}
