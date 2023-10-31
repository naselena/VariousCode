package JavaRushTests;

public class Outer {
    class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }
    }
}
class Solution_outer{
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Nested nested=new Outer.Nested();
    }
}
