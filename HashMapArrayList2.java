package JavaRushTests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapArrayList2 {
    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static ArrayList<String> getProgrammingLanguages() {
        //напишите тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");


        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < programmingLanguages.size(); i++) {
            String value = programmingLanguages.get(i);
            Integer key = i;
            map.put(i, value);
        }
        System.out.println(map);
        return programmingLanguages;
    }
}


