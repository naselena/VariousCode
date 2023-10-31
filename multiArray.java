package JavaRushTests;

import java.util.Scanner;

public class multiArray {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        multiArray=new int[console.nextInt()][];
        for(int i=0; i<multiArray.length; i++){
            multiArray[i]=new int[console.nextInt()];
        }
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
