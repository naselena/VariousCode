package JavaRushTests;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {
   public static  ArrayList<Integer>numbers=new ArrayList<>(10);

    public static void main(String[] args) {
        init();
       // print();

        reverse();
        //print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
    }

    public static void reverse() {
        //Collections.reverse(numbers);
       // System.out.println(numbers);
//        for (int i=0; i<numbers.size(); i++) {
//            numbers.set(numbers.size() - i - 1, i);
//        }
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i));
            numbers.set(n - i, temp);
        }

    }

//    private static void print() {
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//    }
}
