package JavaRushTests;

public class Balance {
    public static Integer balance=Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Текущий баланс : " + balance);
        processPayment(bill);
        System.out.println("Текущий баланс : " + balance);
    }

    public static void processPayment(String bill) {
int newBill=Integer.parseInt(bill);
        balance -= newBill;
    }
}
