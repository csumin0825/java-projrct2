package com.example.javaproject2.week4.day3.interfacePractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter_Interface {
    private Printer printer;

    public RightTrianglePrinter_Interface(Printer printer){
        this.printer = printer;
    }

    // system.out.     --> Console
    // BufferedWriter  --> Console, File
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i));
    }

//    public void printToFile(String[] lines) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"));
//        for (int i = 0; i < lines.length; i++) {
//            bw.append(lines[i]);
//            bw.flush();
//        }
//        bw.close();
//    }

    // 콘솔에 출력하기
//    public void printToConsole(String[] lines){
//        for (int i = 0; i < lines.length; i++) {
//            System.out.println(lines[i]);
//        }
//    }

    // 모양 출력하기
    public void printShape(int h) throws IOException {
        // 모양 만들기
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = makeALine(h, i + 1);
        }
        // 모양 출력하기
        printer.print(lines);
//        printToFile(lines);
    }

    public static void main(String[] args) throws IOException {
        RightTrianglePrinter_Interface rtp = new RightTrianglePrinter_Interface(new FilePrinter());
        rtp.printShape(5);
    }
}