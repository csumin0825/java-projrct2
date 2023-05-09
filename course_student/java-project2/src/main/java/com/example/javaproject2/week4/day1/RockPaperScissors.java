package com.example.javaproject2.week4.day1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public String play(int computer, int user) {
        if (computer == user) {
            System.out.println("tie");
            return "tie";
        } else if (computer == 0 && user == 1 || computer == 1 && user == 2 || computer == 2 && user == 0) {
            System.out.println("win");
            return "win";
        } else {
            System.out.println("lose");
            return "lose";
        }
    }

    public int getRandRange() {
        Random ran = new Random();
        return ran.nextInt(3);
    }

    public int getUser(){
        Scanner sc = new Scanner(System.in);
        int user;
        while(true){
            System.out.printf("입력하세요 (바위 0, 가위 1, 보 2): ");
            user = sc.nextInt();
            if(user == 0 || user== 1|| user == 2) break;
            else System.out.println("다시 입력하세요.");
        }
        return user;
    }

    public static void main(String[] args) {
        RockPaperScissors RPS = new RockPaperScissors();

        String check = "tie";

        while (check != "win") {
            int user = RPS.getUser();
            int computer = RPS.getRandRange();

            System.out.printf("computer : %d , user : %d\n", computer, user);
            check = RPS.play(computer, user);
        }
    }
}
