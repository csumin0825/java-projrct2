package com.example.javaproject2.week4.day3;

public class DrawDiamond {
    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static void main(String[] args) {
        int h = 5;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
//            System.out.printf("pivot: %d %d %d\n", pivot, i, -2 + h - i - 2);
            if (i <= pivot) {
                // 피라미드 출력
                // 초항이 3 등차가 -2
                System.out.printf("%s%s\n", getRepeatedSymbol(" ", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
            } else {
                // 역피라미드 출력
                System.out.printf("%s%s\n", getRepeatedSymbol(" ", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
            }
        }
    }
}
