package JavaRushTests;

import java.util.Scanner;

public class Circle_surface {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        int radius=console.nextInt();
        double pi=3.14;
        int S=(int)(pi*radius*radius);
        System.out.println(S);
    }
}
