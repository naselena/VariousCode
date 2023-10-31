package JavaRushTests;

import java.io.*;

public class StreamTesting3 {
    public static void main(String[] args) throws IOException {
        try (
                Reader reader = new FileReader("JavaRush.iml");
                Writer writer = new FileWriter("JavaRush.txt", true);
        ) {
            char[]buffer=new char[4096];
            int i = reader.read(buffer);
            while (i != -1) {
                i=reader.read(buffer, 0, i);
                writer.write(i);
            }
        }
    }
}
