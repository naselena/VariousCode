package JavaRushTests;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;


public class birthDate {

    static Calendar birthDate = new GregorianCalendar(1987, Calendar.MARCH, 29);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }


    static String getDayOfWeek(Calendar calendar) {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE", new Locale("ru"));
        String day=formatter.format(calendar.getTime());
       return day;
    }

}