package JavaRushTests;

public class Massive_combining {
}
class Solution3 {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray=new int[firstArray.length+secondArray.length];
        for (int a = 0; a < firstArray.length; a++) {
            resultArray[a] = firstArray[a];
        }
        for (int b = firstArray.length; b < resultArray.length; b++) {
            resultArray[b] = secondArray[b- firstArray.length];
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
