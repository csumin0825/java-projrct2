package com.example.javaproject2.week4.day1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors_korean {
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
        String user;
        while(true){
            System.out.printf("입력하세요. : ");
            user = sc.nextLine();
            if(user.equals("가위") || user.equals("바위")|| user.equals("보")) break;
            else System.out.println("다시 입력하세요.");
        }
        return checkUserNum(user);

    }

    public int checkUserNum(String input){
        return switch (input){
            case "바위" -> 0;
            case "가위" -> 1;
            case "보" ->  2;
            default -> throw new IllegalStateException("X" + input);
        };
    }

    public void printResult(int computer, int user){
        String computerPick = switch (computer){
            case 0 -> "바위";
            case 1 -> "가위";
            case 2 -> "보";
            default -> "X";
        };
        String userPick = switch (user){
            case 0 -> "바위";
            case 1 -> "가위";
            case 2 -> "보";
            default -> "X";
        };
        System.out.printf("computer : %s , user : %s\n", computerPick, userPick);
    }

    public static void main(String[] args) {
        RockPaperScissors_korean RPS = new RockPaperScissors_korean();

        String check = "tie";

        while (check != "win") {
            int user = RPS.getUser();
            int computer = RPS.getRandRange();

            RPS.printResult(user, computer);
            check = RPS.play(computer, user);
        }
    }
}
