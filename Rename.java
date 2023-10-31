package JavaRushTests;

public class Rename {

        public static void main(String[] args) {
            String string = "12.84";
            double newDouble=Double.parseDouble(string);
            int newInt=(int)Math.round(newDouble);
            System.out.println(newInt);
    }
}
