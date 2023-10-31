package JavaRushTests;

import java.time.LocalDate;

public class DateAPI {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }
    public static LocalDate example=LocalDate.of(2020, 9, 12);
    static LocalDate nowExample() {
        LocalDate today=LocalDate.now();
        return today;
    }static LocalDate ofExample() {
        LocalDate date1=example;
        return date1;
    }static LocalDate ofYearDayExample() {
        int day=example.getDayOfYear();
       LocalDate date2=LocalDate.ofYearDay(2020, day);
        return date2;
    }static LocalDate ofEpochDayExample() {
        long days=example.toEpochDay();
        LocalDate date3=LocalDate.ofEpochDay(days);
        return date3;
    }
}
