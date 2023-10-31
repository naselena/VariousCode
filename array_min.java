package JavaRushTests;

import java.util.Arrays;
import java.util.Scanner;

public class array_min {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        Arrays.sort(ints);
        return Math.min(ints[0], ints[9]);
    }

    public static int[] getArrayOfTenElements() {
        int[]array=new int[10];
        Scanner console=new Scanner(System.in);
        for(int i=0; i<10; i++){
            array[i]=console.nextInt();
        }
        return array;
    }
}
