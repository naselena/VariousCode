package JavaRushTests;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;


public class ConvertingTime {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

        static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
            Set<LocalDateTime> result = new HashSet<>();

            for (Map.Entry<LocalDate, List<LocalTime>> entry : sourceMap.entrySet()) {
                for (LocalTime time : entry.getValue()) {
                    result.add(LocalDateTime.of(entry.getKey(), time));
                }
            }

            return result;
    }



    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}

 class DateTimeGenerator {

    private static final long MIN_DAY = LocalDate.of(1990, 1, 1).toEpochDay();
    private static final long MAX_DAY = LocalDate.of(2020, 12, 31).toEpochDay();

    private static long maxNano = 86399999999999L;

    public static LocalDate generateDate() {
        long randomDay = ThreadLocalRandom.current().nextLong(MIN_DAY, MAX_DAY);
        return LocalDate.ofEpochDay(randomDay);
    }

    public static LocalTime generateTime() {
        long randomTime = ThreadLocalRandom.current().nextLong(0, maxNano);
        return LocalTime.ofNanoOfDay(randomTime);
    }

    public static List<LocalTime> generateTimeList() {
        List<LocalTime> timeList = new ArrayList<>();
        int size = ThreadLocalRandom.current().nextInt(1, 5);
        for (int i = 0; i < size; i++) {
            timeList.add(generateTime());
        }
        return timeList;
    }

    public static Map<LocalDate, List<LocalTime>> generateDateMap() {
        Map<LocalDate, List<LocalTime>> dateMap = new HashMap<>();
        int size = ThreadLocalRandom.current().nextInt(3, 7);
        for (int i = 0; i < size; i++) {
            dateMap.put(generateDate(), generateTimeList());
        }
        return dateMap;
    }
}
