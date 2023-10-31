package JavaRushTests;

import java.util.ArrayList;

public class ArrayStringrReverse {
    public static ArrayList<String> strings=new ArrayList<String>();
    static String s1="Hello";
    static String s2="Bonjour";
    static String s3="Hi";
    static String s4="Guten Tag";
    public static void printArray(){
        strings.add(s1);
        strings.add(s2);
        strings.add(s3);
        strings.add(s4);
        System.out.println(strings);
    }
    public static void printReversedArray(){
        int n = strings.size()-1;

        for (int i=0; i<strings.size()/2; i++){
            String temp= strings.get(i);
            strings.set(i,strings.get(n-i));
            strings.set(n-i, temp);
        }

        System.out.println(strings);
    }

    public static void main(String[] args) {
        printArray();
        printReversedArray();
    }
}
