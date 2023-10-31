package JavaRushTests;

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.year=year;
        this.color=color;
        this.model=model;
    }

    public CarConcern(String model, int year) {
        this.year=year;
     this.color="Оранжевый";
        this.model=model;
    }

    public CarConcern(String model) {
        this.color="Оранжевый";
        this.model=model;
        this.year=4321;
    }
}