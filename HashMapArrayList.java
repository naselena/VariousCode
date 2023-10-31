package JavaRushTests;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapArrayList {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }
    public static HashMap<Integer, String>getProgrammingLanguages() {

       HashMap<Integer, String>programmingLanguages=new HashMap<>();
        var map = new HashMap<Integer, String>();

        for(int i = 0; i < programmingLanguages.size(); i++) {
            map.put(i, programmingLanguages.get(i));
        }
       //for(int i=0; i< programmingLanguages.size(); i++) {
           programmingLanguages.put(0, "Java");
           programmingLanguages.put(1, "Kotlin");
           programmingLanguages.put(2, "Go");
           programmingLanguages.put(3, "Javascript");
           programmingLanguages.put(4, "Typescript");
           programmingLanguages.put(5, "Python");
           programmingLanguages.put(6, "PHP");
           programmingLanguages.put(7, "C++");
      // }
        return programmingLanguages;
        }



}
