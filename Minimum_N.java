package JavaRushTests;

import java.util.Scanner;

/*
Минимальное из N чисел
*/

public class Minimum_N {
//    public static int[] array;
//
//    public static void main(String[] args) throws Exception {
//        Scanner console=new Scanner(System.in);
//        int N=console.nextInt();
//        int array[]=new int[N];
//        for(int i=0; i<array.length; i++){
//            array[i]=console.nextInt();
//            //System.out.println(array[i]);
//        }
//        int min=array[0];
//        for(int j=0; j<array.length; j++){
//            if(array[j]<min){
//                min=array[j];
//            }
//        }
//        System.out.println(min);
//    }

    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }
}
