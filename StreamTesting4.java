package JavaRushTests;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StreamTesting4 {
    public static void main(String[] args) throws IOException {
//        try (
//                FileInputStream input = new FileInputStream("Test.txt");
//                Reader reader = new InputStreamReader(input, StandardCharsets.US_ASCII);
//                BufferedReader bufferedReader = new BufferedReader(reader);) {
//            while (bufferedReader.ready()) {
//                System.out.println(bufferedReader.readLine());
//            }}
//        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(new byte[10]);
//        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
//        byteArrayInputStream.read();
//        byteArrayOutputStream.write(new byte[10]);

//        File file=new File("1/2/3/4/5");
//        file.mkdirs();
        File file1=new File("JavaRushTests");
        String[]strings=file1.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
              return name.startsWith("array");
            }
        });
        if (strings != null) {
            for (String s : strings) {
                System.out.println(s);
            }
        }



    }
}