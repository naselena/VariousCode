package JavaRushTests;

import java.util.Scanner;




public class TryWithResources2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            //Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
        finally{
            scanner.close();
        }
    }
}

