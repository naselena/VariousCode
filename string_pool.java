package JavaRushTests;

public class string_pool {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        String str1=first.intern();
        String str2=second.intern();
        return str1==str2;
    }
}
