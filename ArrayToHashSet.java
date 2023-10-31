package JavaRushTests;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayToHashSet {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
     HashSet<String>hashSet=new HashSet<>();
     for (var i=0; i<strings.length; i++){
         String str=strings[i];
         hashSet.add(str);
     }
     return hashSet;
    }
}
