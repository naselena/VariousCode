package JavaRushTests;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class FixDate2 {

        public static void main(String[] args) {
            Date date = new Date("6 January 2010");
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Calendar cal=new GregorianCalendar();
          cal.getCalendarType();
            GregorianCalendar gregCal=new GregorianCalendar();
            gregCal.set(87, Calendar.MARCH, 29);
            System.out.println(formatter.format(date));

            Calendar calendar=Calendar.getInstance();
            System.out.println(calendar);
            System.out.println(calendar.getActualMaximum(Calendar.MONTH));
            calendar.getActualMaximum(Calendar.MONTH);
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("EEEE", new Locale("ru"));
            Date dob=new Date(87, Calendar.MARCH, 29);
            System.out.println(simpleDateFormat.format(dob));

        }
}
