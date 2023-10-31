package JavaRushTests;

import java.util.Scanner;

public class reverse2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] list = new int[n];
        for(int i=0; i<n; i++){
            list[i]=console.nextInt();
        }
        if(n%2==0) {
            for (int j = list.length-1; j >=0; j--) {
                System.out.println(list[j]);
            }
        }
            else{
                for(int k=0; k< list.length; k++){
                    System.out.println(list[k]);
                }
            }
        }

    }
