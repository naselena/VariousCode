package JavaRushTests;
import java.util.Calendar;

public class calendarYear {
    private int currentYear;
    public int getCurrentYear() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear;
    }


    public static void main(String[] args) {
        calendarYear calendaryear=new calendarYear();
        System.out.println(calendaryear.getCurrentYear());
    }
}
