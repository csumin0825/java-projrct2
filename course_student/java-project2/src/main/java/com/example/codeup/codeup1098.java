package com.example.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class codeup1098 {
    private static int[][] board;

    public codeup1098(int height, int width) {
        this.board = new int[height][width];
    }

    public void set(int length, int direction, int x, int y) {
        for (int i = 0; i < length; i++) {
            if (direction == 0) {
                board[x - 1][y - 1] = 1;
                y += 1;
            } else {
                board[x - 1][y - 1] = 1;
                x += 1;
            }
        }
    }

    public static void print() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int width = sc.nextInt();
        int numOfStick = sc.nextInt();

        int[][] arrOfSticks = new int[numOfStick][4];
        for (int i = 0; i < numOfStick; i++) {
            arrOfSticks[i][0] = sc.nextInt();
            arrOfSticks[i][1] = sc.nextInt();
            arrOfSticks[i][2] = sc.nextInt();
            arrOfSticks[i][3] = sc.nextInt();
        }

        codeup1098 stick = new codeup1098(height, width);
        for (int i = 0; i < numOfStick; i++) {
            stick.set(arrOfSticks[i][0], arrOfSticks[i][1], arrOfSticks[i][2], arrOfSticks[i][3]);
        }
        print();


    }

    ;
}
