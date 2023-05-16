package com.example.javaproject2.week4.day5.HospitalPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx_5 {
    Charset charset;

    public ReadFileEx_5(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        // BufferReader 선언 --> File연결
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

        // BufferedReader에서 loop으로 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) { // readLine한 걸 line에 넣고 line이 null일 때까지 반복
            lines.add(line);
        }
        return lines;
    }

    private Hospital parse(String str) {
        String[] splited = str.split(","); // split한 후
        Address address = new Address(splited[10], splited[5], splited[7]);
        Hospital hospital = new Hospital(splited[1], splited[11], address);
        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines){
        List<Hospital> hospitals = new ArrayList<>();
        for (String line:lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    // FileReader(x)
    public static void main(String[] args) throws IOException {
        ReadFileEx_5 rfe = new ReadFileEx_5(Charset.forName("UTF-8"));
        List<String> strLines = rfe.getLines("hospital_info_10lines.csv");
        List<Hospital> parsedHospital = rfe.getHospitals(strLines);
        System.out.println(parsedHospital.get(0));
    }
}
