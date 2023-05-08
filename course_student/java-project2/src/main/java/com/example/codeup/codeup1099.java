package com.example.codeup;
import java.util.Scanner;

public class codeup1099 {
    public static void printArr(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                System.out.printf("%s ", arr[i][j]);
            }
            System.out.printf("\n");
        }
    }


    public static String[][] arrFromScanner() {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[10][10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextLine().split(" ");
        }
        return arr;
    }
    public static void main(String[] args) {
        String[][] arr = arrFromScanner();
        int row = 1;
        int col = 1;
        for (int i = 0; i < 100; i++) {
            if ("2".equals(arr[row][col])) {
                arr[row][col] = "9";
                break;
            } else if (row < arr.length - 1 && "0".equals(arr[row][col]) && !"1".equals(arr[row][col + 1])) {
                arr[row][col++] = "9";
            } else if (row < arr.length - 1 && "0".equals(arr[row][col]) && "1".equals(arr[row][col + 1])) {
                arr[row++][col] = "9";
            }
        }
        printArr(arr);
    }
}