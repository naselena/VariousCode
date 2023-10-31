package JavaRushTests;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StreamTesting {

    public static void main(String[] args) throws IOException {

        List<String>allLines=Files.readAllLines(Path.of("C:\\Users\\nas-e\\Desktop\\Testing.txt"));
        if(!allLines.isEmpty()){
        for (String s: allLines) {
            System.out.println(s);
        }}
        else{
            System.out.println("It's empty");
        }
    }
}



