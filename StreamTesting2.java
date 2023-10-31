package JavaRushTests;

import java.io.*;
import java.net.URI;
import java.nio.file.*;
import java.util.List;

public class StreamTesting2 {
    public static void main(String[] args) throws IOException {
        try (
                InputStream input = new FileInputStream("C:\\Users\\nas-e\\Desktop\\Testing.txt");
                OutputStream output = new FileOutputStream("Test.txt", true);
        ) {
            byte[]buffer=new byte[4096];
            int i = input.read(buffer);
            while (i != -1) {
                output.write(buffer, 0, i);
                i = input.read(buffer);

            }
        }
    }

}
