package JavaRushTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Tesing2 {
    public static String a="Elena";
    public static String b="Alexander";
    public static String c="Sophia";
    public static String d="Mike";

    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList(a,b,c,d));
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

        for(int i=0; i< list.size(); i++) {
            int key=i;
            System.out.println( Collections.singletonMap(i,list.get(i)));
        }
        ArrayList<Integer>listNumbers=new ArrayList<>();
        listNumbers.addAll(Arrays.asList(1,2,-4,57, 34, 900, -23));
        System.out.println(listNumbers);
        Collections.sort(listNumbers);
        System.out.println(listNumbers);
        int num=Collections.binarySearch(listNumbers, 3);
        System.out.println(num);
        int freq=Collections.frequency(listNumbers, 900);
        System.out.println(freq);
        int max=Collections.max(listNumbers);
        System.out.println(max);
        Collections.shuffle(listNumbers);
        System.out.println(listNumbers);
        Collections.shuffle(listNumbers);
        System.out.println(listNumbers);
        Collections.swap(listNumbers,0, 3);
        System.out.println(listNumbers);

    }
}
