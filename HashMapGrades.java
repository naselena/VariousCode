package JavaRushTests;

import java.util.HashMap;

public class HashMapGrades {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }
    public static void addStudents() {
    grades.put("Elena Nasikovskaia", 5.0);
    grades.put("Alexander Ferby", 5.0);
    grades.put("Max White", 4.0);
    grades.put("Emily Fen", 4.5);
    grades.put("Vanessa May", 4.8);
    }
}
