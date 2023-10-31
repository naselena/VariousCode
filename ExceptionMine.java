package JavaRushTests;

public class ExceptionMine {
    public static int a;
    public static int b;
    public static void count(int a, int b)
    {
        try{
            int c=a/b;
        }
        catch (ArithmeticException e){
            e.getMessage();
           // e.printStackTrace();
            System.out.println("Wellllll....");
        }
    }

    public static void main(String[] args) throws ArithmeticException {
            count(10, 0);
            System.out.println("Dividing by zero");

        }

    }

