package JavaRushTests;

public class Skyscraper2 {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    public Skyscraper2(){
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }
    public Skyscraper2(int floorsCount){
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floorsCount);
    }
    public Skyscraper2(String developer){
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }


    public static void main(String[] args) {
        Skyscraper2 skyscraper = new Skyscraper2();
        Skyscraper2 skyscraperTower = new Skyscraper2(50);
        Skyscraper2 skyscraperSkyline = new Skyscraper2("JavaRushDevelopment");
    }
}
