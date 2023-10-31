package JavaRushTests;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverseTest {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void getNumbers() {
        for (int i = 0; i <= 20; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
    }
    public static void reverseNumbers(){
//        Collections.reverse(numbers);
       // System.out.println(numbers);
//        int n=numbers.size()-1;
//        for(int i=0; i<numbers.size()/2; i++){
//            int temp=numbers.get(i);
//            numbers.set(i, numbers.get(n-i));
//            numbers.set(n-i, temp);
//        }
//        System.out.println(numbers);

        int n = numbers.size()-1;
        for (int i=0; i<numbers.size()/2; i++) {
            int temp = numbers.get(i);
            numbers.set(i,numbers.get(n-i));
            numbers.set(n-i, temp);
        }
        System.out.println(numbers);
    }


    public static void main(String[] args) {
        getNumbers();
        reverseNumbers();

    }
}