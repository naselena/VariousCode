package JavaRushTests;

import java.nio.file.Path;
import java.util.Scanner;


public class PathTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path=Path.of(str).getRoot();
        System.out.println(path);
    }
}
