package JavaRushTests;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TryWithResources {
    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))){
            //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            System.out.println(line.toLowerCase());
            //reader.close();
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}