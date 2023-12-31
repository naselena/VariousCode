package JavaRushTests;

import java.time.Instant;
import java.time.temporal.ChronoUnit;


public class InstantTime2 {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    static public Instant plusMinutes(Instant instant, long minutes) {
     Instant result=instant.plus(minutes, ChronoUnit.MINUTES);
        return result;
    }
    static public Instant plusHours(Instant instant, long hours) {
        Instant result=instant.plus(hours, ChronoUnit.HOURS);
        return result;
    }
    static public Instant plusDays(Instant instant, long days) {
        Instant result=instant.plus(days, ChronoUnit.DAYS);
        return result;
    }
    static public Instant minusMinutes(Instant instant, long minutes) {
        Instant result=instant.minus(minutes, ChronoUnit.MINUTES);
        return result;
    }
    static public Instant minusHours(Instant instant, long hours) {
        Instant result=instant.minus(hours, ChronoUnit.HOURS);
        return result;
    }
    static public Instant minusDays(Instant instant, long days) {
        Instant result=instant.minus(days, ChronoUnit.DAYS);
        return result;
    }
}