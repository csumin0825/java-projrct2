package com.example.javaproject2.week4.day3.interfacePractice2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer2{
    @Override
    public void print(String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"));
        bw.append(message);
        bw.flush();
        bw.close();
    }
}
