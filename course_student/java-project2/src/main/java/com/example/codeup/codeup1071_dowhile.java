package com.example.codeup;

import java.util.Scanner;

public class codeup1071_dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num ;

        do{
            num = sc.nextInt();
            if(num != 0){
                System.out.println(num);
            }
        }while(num != 0);
    }
}
