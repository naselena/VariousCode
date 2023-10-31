package JavaRushTests;

import java.util.Scanner;

public class number_loop {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        String str=console.nextLine();
        int n=console.nextInt();
        int y=0;
        if(n>0&&n<5){
            do{
                y++;
                System.out.println(str);
            }
            while (y<n);
        }
        else{
            System.out.println(str);
        }
    }
}
