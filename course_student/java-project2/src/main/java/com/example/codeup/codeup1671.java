package com.example.codeup;

import java.util.Scanner;

public class codeup1671 {
        public static void play(int computer, int user){
        if(computer == user){
            System.out.println("tie");
        }else if(computer == 0){
            if(user == 1){
                System.out.println("win");
            }else{
                System.out.println("lose");
            }
        }else if(computer == 1){
            if(user == 0){
                System.out.println("lose");
            }else{
                System.out.println("win");
            }
        }else if(computer == 2){
            if(user == 0){
                System.out.println("win");
            }else{
                System.out.println("lose");
            }
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
