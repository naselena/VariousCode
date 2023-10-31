package JavaRushTests;
import java.time.LocalTime;


public class TimeAPI2 {

    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
           next = amazingMethod(next);
            Thread.sleep(500);
        }
    }
    static LocalTime amazingMethod(LocalTime base) {
        int minutes=60*24;
        int minutesADay=(LocalTime.MAX.getMinute()+1)*24;
        int MinNeeded=minutesADay/5;
        return base.plusMinutes(MinNeeded);
    }
}
