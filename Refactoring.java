package JavaRushTests;

import static JavaRushTests.Refactoring.Calculator.multiply;

public class Refactoring {
    public static class Calculator{
        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }

    }
        public static final String EQUAL = " = ";

        public static void main(String[] args) {
            int a = 45;
            int b = 15;
            Refactoring.Calculator.add(a,b);
            Refactoring.Calculator.subtract(a,b);
            Refactoring.Calculator.multiply(a,b);
            Refactoring.Calculator.divide(a,b);
        }
}
