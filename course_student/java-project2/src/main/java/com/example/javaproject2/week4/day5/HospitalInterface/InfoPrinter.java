package com.example.javaproject2.week4.day5.HospitalInterface;

import java.io.IOException;

public class InfoPrinter {
    Printer printer;

    public InfoPrinter(Printer printer){
        this.printer = printer;
    }
    public void printInfo(String fileName) throws IOException {
        printer.print(fileName);
    }
    public static void main(String[] args) throws IOException {
        InfoPrinter IP = new InfoPrinter(new InputStreamPrinter());
//        InfoPrinter IP = new InfoPrinter(new BufferReaderPrinter());
        IP.printInfo("./hospital_Info_0920_utf8.csv");
    }
}
