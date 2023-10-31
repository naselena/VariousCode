package JavaRushTests;
import javax.management.ObjectName;
import java.time.Instant;


public class InstantTime {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        Instant instant = Instant.ofEpochMilli(Long.MAX_VALUE);
        return instant;
    }
    static Instant getMaxFromSeconds() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
    }
    static Instant getMaxFromSecondsAndNanos() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), Instant.MAX.getNano());
    }
}
