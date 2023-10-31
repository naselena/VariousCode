package JavaRushTests;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
public class Stream{

        public static void main(String[] args) {
        try(
                Scanner scanner=new Scanner(System.in);
                var  inputStream=Files.newInputStream(Paths.get(scanner.nextLine()));
                var outputStream=Files.newOutputStream(Paths.get(scanner.nextLine()))
                )
        {
            byte[]bytesIn=new byte[1024];
            byte[]bytesOut=new byte[bytesIn.length];
            for(int i=0; i<bytesIn.length; i++){
                for(int j=i+1; j<bytesIn.length; j++){
                    if(i<bytesIn.length-1){
                        bytesIn[i]=bytesOut[j];
                        bytesOut[j]=bytesIn[i];
                    }
                    else{
                        bytesIn[i]=bytesOut[j];
                    }
                }
            }
            outputStream.write(bytesOut);
        }
        catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
        }
}
