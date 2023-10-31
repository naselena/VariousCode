package JavaRushTests;

public class CountDigits {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
       System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count1 = 0;
        for (int x = 0; x < string.length(); x++) {
        if(Character.isDigit(string.charAt(x))){
            count1++;
        }
            }
        return count1;
    }

    public static int countLetters(String string) {
        int count2 = 0;
        for (int x = 0; x < string.length(); x++) {
            if(Character.isLetter(string.charAt(x))){
                count2++;
            }
        }
        return count2;
    }

    public static int countSpaces(String string) {
        int count3 = 0;
        for (int x = 0; x < string.length(); x++) {
            if(Character.isSpaceChar(string.charAt(x))){
                count3++;
            }
        }
        return count3;

    }
}
