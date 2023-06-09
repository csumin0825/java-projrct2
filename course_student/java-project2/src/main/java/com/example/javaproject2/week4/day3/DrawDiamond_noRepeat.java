package com.example.javaproject2.week4.day3;

public class DrawDiamond_noRepeat {
    public static String getRepeatedSymbol(String symbol, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += symbol;
        }
        return answer;
    }

    public static String makeALine(int h, int i) {
        int pivot = h / 2;
        if (i <= pivot) {
            // 피라미드 출력
            // 초항이 3 등차가 -2
            return String.format("%s%s\n", getRepeatedSymbol(" ", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
        } else {
            // 역피라미드 출력
            return String.format("%s%s\n", getRepeatedSymbol(" ", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
        }
    }

    public static void main(String[] args) {
        int h = 7;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
//            System.out.printf("pivot: %d %d %d\n", pivot, i, -2 + h - i - 2);
            System.out.printf(makeALine(h, i));
        }
    }
}