package JavaRushTests;

import java.util.Scanner;


public class maximum {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console=new Scanner(System.in);
        int n=console.nextInt();
        array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=console.nextInt();
        }
        int max=array[0];
        for(int i=1; i<array.length; i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println(max);
    }

}

