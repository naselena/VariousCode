package JavaRushTests;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class StreamStream {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result=new StringBuilder(String.valueOf(outputStream)).reverse().toString();
        outputStream.reset();
        System.out.println(result);

//        Scanner scanner = new Scanner(System.in);
//        printSomething(scanner.nextLine());
//        String result = outputStream.toString();
//        outputStream.reset();
//        StringBuilder stringBuilder = new StringBuilder(result);
//        String reverse = stringBuilder.reverse().toString();
//        printSomething(reverse);
//        System.out.println(outputStream);
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}
