package JavaRushTests;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;



public class GlobalTime {

    static LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 19, 9, 17);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;

    public static void main(String[] args) {
     globalTime = localDateTime.atZone(zoneId);

        System.out.println(globalTime);
    }
}
