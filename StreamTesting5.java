package JavaRushTests;

import java.io.*;

public class StreamTesting5 {
    public static void main(String[] args)throws IOException {
       try(
               FileInputStream inputStream=new FileInputStream("Test.txt");
               Reader reader=new InputStreamReader(inputStream);
               BufferedReader bufferedReader=new BufferedReader(reader);
       )
       {
           while(bufferedReader.ready()){
               System.out.println(bufferedReader.readLine());
           }
       }

    }
}
