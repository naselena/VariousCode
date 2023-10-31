package JavaRushTests;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Stream3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            List<String> input = Files.readAllLines(Paths.get(scanner.nextLine()));
            String string = input.toString();
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) != ',') {
                    if (string.charAt(i) != '.') ;
                    else if (string.charAt(i) != ' ') {
                        System.out.println(string.charAt(i));
                    }
                    }
                }
        }
        catch (Exception e){
            System.out.println("Something went wrong : " + e);
        }
    }
}

