package com.example.codeup;

import java.util.Scanner;

public class codeup1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();

        for(int j = 1; j<=dice1; j++){
            for(int i = 1; i<=dice2; i++){
                System.out.println(j+" "+i);
            }
        }
    }
}
