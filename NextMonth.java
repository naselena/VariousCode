package JavaRushTests;

public class NextMonth {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }
    public enum Month {
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

    public static Month getNextMonth(Month month) {
        int number=month.ordinal();
        Month nextMonth;
        if(number<11){
        nextMonth=Month.values()[number+1];}
        else{
        nextMonth=Month.JANUARY;
        }
        return nextMonth;
    }

}
