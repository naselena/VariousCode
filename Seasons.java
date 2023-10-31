package JavaRushTests;

public class Seasons {

    public static void main(String[] args) {
        System.out.println(SeasonsTest.Season.WINTER);
        System.out.println(SeasonsTest.Season.SPRING);
        System.out.println(SeasonsTest.Season.SUMMER);
        System.out.println(SeasonsTest.Season.AUTUMN);
    }
}
class SeasonsTest{
    public enum Season{
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN
    }
}