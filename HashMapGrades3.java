package JavaRushTests;

import java.util.HashMap;
import java.util.Map;

public class HashMapGrades3 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }public static void addStudents() {
        grades.put("Кесарчук Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }
    public static void printStudentsInfo() {
//    for(Map.Entry<String, Double> pair: grades.entrySet()){
//        String key= pair.getKey();
//        Double value= pair.getValue();
//        System.out.println(key + " : " + value);
//    }
        for(Map.Entry enty : grades.entrySet()){
            System.out.printf("%s : %s \n",enty.getKey(),enty.getValue());
        }
        for(var x: grades.entrySet()){
            System.out.println(x.getKey() + " : " + x.getValue());
        }
    }
}
