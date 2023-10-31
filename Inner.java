package JavaRushTests;

public class Inner {
    int number;
    public void sayIt(int number){
        System.out.println("Say the number " + number);
    }
    public static class Outer{
        int number;
        public void sayItAgain(int number){
            System.out.println("Say the number " + number + " too");
        }
    }
}
class MainInner{
    public static void main(String[] args) {
        Inner inner=new Inner();
        inner.sayIt(10);
        Inner.Outer outer=new Inner.Outer();
        outer.sayItAgain(20);
    }
}
