package JavaRushTests;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class Files1 {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                break;
            }
            Path path = Path.of(str);
            if (Files.isRegularFile(path)) {
                System.out.println(str + THIS_IS_FILE);
            } else if (Files.isDirectory(path)) {
                System.out.println(str + THIS_IS_DIR);
            } else {
                break;
            }
        }
    }
}
