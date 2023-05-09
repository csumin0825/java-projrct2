package com.example.codeup;

import java.util.Scanner;

public class codeup1671_re_re {
    public static void play(int computer, int user) {
        if (computer == user) {
            System.out.println("tie");
        } else if (computer == 0 && user == 1 || computer == 1 && user == 2 || computer == 2 && user == 0) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computer = sc.nextInt();
        int user = sc.nextInt();

        // 0: 바위, 1: 가위, 2: 보
        play(computer, user);
    }
}
