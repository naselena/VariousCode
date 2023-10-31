package JavaRushTests;
import java.util.ArrayList;

public class Salary {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
        waitingEmployees.add(null);
    }

    public static void main(String[] args) {
        initEmployees();
        System.out.println(waitingEmployees.toString());
        System.out.println(alreadyGotSalaryEmployees.toString());
    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(waitingEmployees.indexOf(name), null);
        }
    }
}
