package JavaRushTests;

public class Skyscraper3 {
    private int floorsCount;
    private String developer;

public Skyscraper3(){
    floorsCount=5;
    developer="JavaRushDevelopment";
}
    public Skyscraper3(int floorsCount, String developer){
    this.floorsCount=floorsCount;
    this.developer=developer;
    }



    public static void main(String[] args) {
        Skyscraper3 skyscraper = new Skyscraper3();
        Skyscraper3 skyscraperUnknown = new Skyscraper3(50, "Неизвестно");
    }
}
