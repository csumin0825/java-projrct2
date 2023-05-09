package com.example.codeup;

import java.util.Arrays;

public class codeup1098_ {
    private int[][] arr;

    public codeup1098_(int rowCnt, int colCnt) {
        this.arr = new int[rowCnt][colCnt];
    }

    public void setBeam(int length, int direction, int x, int y) {
        for (int i = 0; i < length; i++) {
            if (direction == 0) {
                arr[x - 1][y + i - 1] = 1;
            } else {
                arr[x + i - 1][y - 1] = 1;
            }
        }
    }
    public void printArr(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        int rowCnt = 5;
        int colCnt = 5;
        codeup1098_ code = new codeup1098_(rowCnt, colCnt);
        code.printArr();
        code.setBeam(2,0,1,1);
        code.printArr();
        code.setBeam(3,1,2,3);
        code.printArr();
        code.setBeam(4,1,2,5);
        code.printArr();
    }
}
