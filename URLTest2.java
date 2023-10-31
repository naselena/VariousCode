package JavaRushTests;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class URLTest2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
    try {
        URL url = new URL(line);

        InputStream inputStream = url.openStream();
        byte[] buffer = inputStream.readAllBytes();
        Path tempFile = Files.createTempFile(null, null);
        Files.write(tempFile, buffer);
    }
    catch (Exception ignored){}
    }
}
