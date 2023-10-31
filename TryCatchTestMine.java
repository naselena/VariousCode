package JavaRushTests;
import java.util.Scanner;

public class TryCatchTestMine {
    public static void main(String[] args) {
        var keyboard=new Scanner(System.in);
       try {
           var words = new String[5];
           int i = 0;
           do {
               words[i] = keyboard.next();
           }
           while (!words[i++].equals("Quit"));
           for (int j = 0; j < 5; j++) {
               System.out.println(words[j].length());
           }
       }
       catch (Exception e){
           System.out.println("Too many words");
       }
        keyboard.close();
    }
}
