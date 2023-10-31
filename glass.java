package JavaRushTests;

import java.util.Scanner;

public class glass {
    public static void main(String[] args) {
        double glass = 0.5;
        int result;
        Scanner console=new Scanner(System.in);
        boolean full=console.nextBoolean();
        if(full){
            result=(int)Math.ceil(glass);
        }
        else{
            result=(int)Math.floor(glass);
        }
        System.out.println(result);
    }
}
