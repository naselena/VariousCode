package JavaRushTests;

import java.util.ArrayList;
import java.util.Arrays;

public class swap {
    static void swap(int[] array, int ind1, int ind2) {
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;

    }

    public static void main(String[] args) {
        int[] arrayToSort = {10, 23, 345, -56, 87, -900, 900};
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arrayToSort.length; i++) {
                if (arrayToSort[i] < arrayToSort[i - 1]) {
                    swap(arrayToSort, i, i - 1);
                    needIteration = true;
                }
            }
        }

    }
}