package JavaRushTests;

import java.util.Collections;

enum MonthsYear {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}
public class Testing4 {
 public static MonthsYear monthsYear;
 public static String value;
    public static void forecast(MonthsYear monthsYear){
        value=switch (monthsYear) {
            case JANUARY, FEBRUARY, MARCH, DECEMBER, NOVEMBER -> "cold";
            case APRIL, MAY -> "Getting warmer";
            case JUNE, JULY, AUGUST, SEPTEMBER -> "Hot";
            case OCTOBER -> "Getting colder";
        };

    }


    public static void main(String[] args) {
        forecast(MonthsYear.APRIL);
        System.out.println(value);

    }


}
