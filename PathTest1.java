package JavaRushTests;

import java.nio.file.Path;
import java.util.Scanner;


public class PathTest1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            Path path=Path.of(str);
            boolean abs=path.isAbsolute();
            if(true){
                System.out.println(path);
            }
            else{
                System.out.println(path.toAbsolutePath());
            }
    }
}
