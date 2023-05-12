package com.example.javaproject2.week4.day5.HospitalInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class BufferReaderPrinter implements Printer{
    @Override
    public void print(String fileName) throws IOException {
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
        System.out.println(lines.get(0));
    }
}
