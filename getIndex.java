package JavaRushTests;

public class getIndex {
    public static void main(String[] args) {
        String string = "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание.";
        String word = "код";
        int indexFromFirstWord = getIndexFromFirstWord(string, word);
        int indexFromLastWord = getIndexFromLastWord(string, word);
        System.out.println("Индекс первого символа первого слова \"" + word + "\" равен - " + indexFromFirstWord);
        System.out.println("Индекс первого символа последнего слова \"" + word + "\" равен - " + indexFromLastWord);
    }
    public static int getIndexFromFirstWord(String string, String word) {
int first=string.indexOf(word, 0);
        return first;
    }
    public static int getIndexFromLastWord(String string, String word) {
        int last=string.lastIndexOf(word);
        return last;
    }
}
