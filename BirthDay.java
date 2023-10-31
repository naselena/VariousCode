package JavaRushTests;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class BirthDay {

    static Date birthDate=new Date(87, 02, 28);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        date=birthDate;
        SimpleDateFormat formatter=new SimpleDateFormat("EEEE", new Locale("ru"));
        return formatter.format(date);
    }
}