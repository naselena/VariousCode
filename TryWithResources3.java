package JavaRushTests;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;



public class TryWithResources3 {
        public static void main(String[] args) throws IOException {
            try (Scanner scanner = new Scanner(System.in); BufferedReader bufferedReader = new BufferedReader(Files.newBufferedReader(Path.of(scanner.nextLine()))))
            {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
            }
            catch (IOException e) {
                System.out.println("Something went wrong : " + e);

            }

        }}
