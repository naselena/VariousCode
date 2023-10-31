package JavaRushTests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerPrint {
    public static void main(String[] args) throws IOException {
     try{
         Scanner scanner=new Scanner(System.in);
     String title= scanner.nextLine();
      List<String>strings;
         strings=Files.readAllLines(Path.of(title));
      for(int i=0; i<strings.size(); i++){
        System.out.println(strings.get(i+1));
        ++i;
      }
     }
     catch (Exception e){
         System.out.println("There's no such file...");
     }

    }
}