package com.example.javaproject2.week4.day2;

public class Pyramid2_ {
    public String spaceChar = "0";

    public Pyramid2_(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
    }

    public void printPyramidWithSpaceChar(int height, String spaceChar) {
        for (int i = 0; i < height; i++) {
            System.out.println(makeALine(height, i));
        }
    }


    public static void main(String[] args) {
        Pyramid2_ pyramid2 = new Pyramid2_(" ");
        Pyramid2_ pyramidSpaceZero = new Pyramid2_("0");
        pyramid2.printPyramidWithSpaceChar(4, " ");
        pyramidSpaceZero.printPyramidWithSpaceChar(5, "0");
    }
}
