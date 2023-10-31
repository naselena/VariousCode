package JavaRushTests;

public class divide {
    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
//        if((a>0&&b==0)||(a==Double.POSITIVE_INFINITY&&b>=0&&b!=Double.POSITIVE_INFINITY)||(a==Double.NEGATIVE_INFINITY&&b<0&&b!=Double.NEGATIVE_INFINITY)){
//           double result=Double.POSITIVE_INFINITY;
//            System.out.println(result);
//        }
//        else if((a<0&&b==0)||(a== Double.NEGATIVE_INFINITY&&b>=0&&b!=Double.POSITIVE_INFINITY)||(a==Double.POSITIVE_INFINITY&&b!=Double.NEGATIVE_INFINITY)){
//            double result=Double.NEGATIVE_INFINITY;
//            System.out.println(result);
//        }
//        else if((a==0&&b==0)||a==Double.NaN||b==Double.NaN||(a==Double.POSITIVE_INFINITY||b==Double.POSITIVE_INFINITY)||(a==Double.NEGATIVE_INFINITY&&b==Double.NEGATIVE_INFINITY)||(a==Double.NEGATIVE_INFINITY&&b==Double.POSITIVE_INFINITY)||(a==Double.POSITIVE_INFINITY&&b==Double.NEGATIVE_INFINITY)){
//            double result=Double.NaN;
//            System.out.println(result);
//        }
//        else{
//            System.out.println(a/b);
//        }
        System.out.println(a/b);
    }
}
