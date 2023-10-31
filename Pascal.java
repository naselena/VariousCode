package JavaRushTests;
import java.util.ArrayList;
import java.util.Arrays;

public class Pascal {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

        public static void main(String[] args) {
         int index= programmingLanguages.indexOf("Pascal");
         programmingLanguages.remove(index);
            System.out.println(programmingLanguages.toString());
        }
}
