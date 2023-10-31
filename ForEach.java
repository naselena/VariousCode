package JavaRushTests;
import java.util.*;

/*
Переводим итератор в цикл for-each
*/

public class ForEach {

    public static void printList(ArrayList<String> words) {
        for (String str:words) {
            System.out.println(str);
        }
    }

    public static void printHashSet(HashSet<String> words) {
        for(String str: words){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
