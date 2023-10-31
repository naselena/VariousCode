package JavaRushTests;

import java.util.Arrays;

public class fill_array {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        for(int i=0; i<array.length; i++){
            array[i]=i;
//            if(array[i]<begin){
//                array[i]=null;
//            }
//            else if(array[i]>end){
//                array[i]=null;
//            }
            Arrays.fill(array, value, begin, end);
        }
    }
}
