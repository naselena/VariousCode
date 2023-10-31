package JavaRushTests;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class URLTest3 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        try(InputStream input=url.openStream()){
     byte[]buffer=input.readAllBytes();
     String string=new String(buffer);
        System.out.println(string);}
        catch (Exception ignored){}

    }
}