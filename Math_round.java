package JavaRushTests;

import java.util.Scanner;

public class Math_round {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        int speedMS=console.nextInt();
        long speedKmH=Math.round(speedMS*3.6);
        System.out.println(speedKmH);

    }
}
