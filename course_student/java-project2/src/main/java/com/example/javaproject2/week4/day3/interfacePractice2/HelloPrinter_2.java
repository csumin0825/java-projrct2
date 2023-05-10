package com.example.javaproject2.week4.day3.interfacePractice2;

public class HelloPrinter_2 {
    // 파일에도 저장하고싶고
    // 콘솔에도 출력하고 싶다

    // 콘솔에 출력하는 기능
    public void print(String message){
        System.out.println(message);
    }

    // 기능1 추가
    // n을 받아서 반복하는 메서드
    public void repeatMessage(int n, String message){
        for (int i = 0; i < n; i++) {
            print(message);
        }
    }

    public static void main(String[] args) {
        HelloPrinter_2 hp = new HelloPrinter_2(); // 인스턴스 생성
        hp.repeatMessage(5, "Hello"); // 호출
        hp.repeatMessage(5, "Bye");
    }
}
