package com.example.javaproject2.week4.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx_2 {
    public List<String> getLines(String fileName){
        List<String> lines = new LinkedList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName),
                StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) { // readLine한 걸 line에 넣고 line이 null일 때까지 반복
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    // FileReader(x)
    public static void main(String[] args) throws IOException {
        ReadFileEx_2 rfe = new ReadFileEx_2();
        List<String> result = rfe.getLines("hospital_info_0920_utf8.csv");
        for (int i = 0; i < 10; i++) {
            System.out.println(result.get(i));
        }
    }
}
