package JavaRushTests;
enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}
public class Testing3{
    Months months;
   // String value;
    public Testing3(Months months){
        this.months=months;
    }
    public void weather(){
        switch (months){
            case JANUARY, FEBRUARY, DECEMBER ->{
                System.out.println("Cold winter month");
            }
            case MARCH, APRIL -> {
                System.out.println("Spring is coming");
            }
            case MAY -> {
                System.out.println("It's almost summer");
            }
            case JUNE, JULY, AUGUST -> {
                System.out.println("Summer time!!!");
            }
            case SEPTEMBER -> {
                System.out.println("The summer is over");
            }
            case OCTOBER, NOVEMBER -> {
                System.out.println("Rainy autumn");
            }
        }
    }

    public static void main(String[] args) {
     Testing3 testing3=new Testing3(Months.JANUARY);
        testing3.weather();

    }


}

