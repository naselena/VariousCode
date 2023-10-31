package JavaRushTests;

public class City {
    private String name;
    private int temperature;

    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }
}
class SolutionCity {

    public static void showWeather(City city) {
        System.out.println("В городе " + city.getName() +  " сегодня температура воздуха " + city.getTemperature());
    }

    public static void main(String[] args) {
        City city=new City("Москва", 10);
        showWeather(city);
    }
}
