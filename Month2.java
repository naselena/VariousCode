package JavaRushTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Month2{
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
        DECEMBER;

//        public static List<Month>asList(){
//            ArrayList<Month>List=new ArrayList<>();
//            Collections.addAll(List, values());
//            return List;
//        }

//   public static void getWinterMonths(){
//       List<Month2>winterList=new ArrayList<>();
//       winterList.add(Month2.DECEMBER);
//       winterList.add(Month2.JANUARY);
//       winterList.add(Month2.FEBRUARY);
//
//      // System.out.println(winterList);
//    }
//    public static void getSpringMonths(){
//        List<Month2>springList=new ArrayList<>();
//        springList.add(Month2.MARCH);
//        springList.add(Month2.APRIL);
//        springList.add(Month2.MAY);
//    }
//    public static void getSummerMonths(){
//       List<Month2>summerList=new ArrayList<>();
//       summerList.add(Month2.JUNE);
//       summerList.add(Month2.JULY);
//       summerList.add(Month2.AUGUST);
//    }
//    public static void getAutumnMonths(){
//       List<Month2>autumnList=new ArrayList<>();
//       autumnList.add(Month2.SEPTEMBER);
//       autumnList.add(Month2.OCTOBER);
//       autumnList.add(Month2.NOVEMBER);
//    }
//
//    public static void main(String[] args) {
//      getWinterMonths();
//    }

    public static Month2[]getWinterMonths(){
        return new Month2[]{DECEMBER,JANUARY, FEBRUARY};
    }
    public static Month2[]getSpringMonths(){
        return new Month2[]{MARCH, APRIL, MAY};
    }
    public static Month2[]getSummerMonths(){
        return new Month2[]{JUNE, JULY,AUGUST};
    }
    public static Month2[]getAutumnMonths(){
        return new Month2[]{SEPTEMBER, OCTOBER, NOVEMBER};
    }
}





