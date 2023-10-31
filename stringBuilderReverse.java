package JavaRushTests;

public class stringBuilderReverse {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder builder=new StringBuilder(string);
        builder.reverse();
        return builder.toString();
    }
}
