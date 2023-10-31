package JavaRushTests;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class Files3 {

    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
       DirectoryStream<Path>files=Files.newDirectoryStream(directory);
       for(Path path: files) {
           if (Files.isDirectory(directory)) {
               System.out.println(directory + THIS_IS_DIR);
           } else if (Files.isRegularFile(directory)) {
               System.out.println(directory + THIS_IS_FILE);
           }
       }
    }
}

//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        Path directory = Path.of(scanner.nextLine());
//        try (DirectoryStream<Path> paths = Files.newDirectoryStream(directory)) {
//            for (Path path : paths) {
//                if (Files.isRegularFile(path)) {
//                    System.out.println(path.toString() + THIS_IS_FILE);
//                } else if (Files.isDirectory(path)) {
//                    System.out.println(path.toString() + THIS_IS_DIR);
//                }
//            }
//        }
//    }
//}


