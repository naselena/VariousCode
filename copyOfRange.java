package JavaRushTests;

import java.util.Arrays;

public class copyOfRange {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int half=(array.length)/2+array.length%2;
        if(half%2==0){
            result[0]= Arrays.copyOfRange(array, 0, half);
            result[1]=Arrays.copyOfRange(array, half, array.length);
        }
        else{
            result[0]=Arrays.copyOfRange(array, 0, half+1);
            result[1]=Arrays.copyOfRange(array, half+1, array.length);
        }
        System.out.println(Arrays.deepToString(result));
    }
}
