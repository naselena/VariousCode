package JavaRushTests;
import java.util.Objects;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public boolean equals(Object o) {
  Iphone iphone=(Iphone)o;
  if(iphone==null){
      return false;
  }
  if(iphone.model.equals(model)&&iphone.color.equals(color)&&iphone.price==price){
      return true;
  }
return false;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
