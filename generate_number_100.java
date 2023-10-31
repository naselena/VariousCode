package JavaRushTests;

public class generate_number_100 {
    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            System.out.println(generateNumber());
        }
    }

    public static int generateNumber() {
        return (int)(Math.random()*100);
    }
}
