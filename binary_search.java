package JavaRushTests;

import java.util.Arrays;

public class binary_search {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[]arrayCopy=Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);
        int index=Arrays.binarySearch(arrayCopy, element);

            System.out.println(index>=0);

    }
}
