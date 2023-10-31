package JavaRushTests;
import java.util.ArrayList;

/*
Дженерики и студенты
*/

public class UniversityDepartment {

    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Акакий"));
        students.add(new Student("Любослав"));

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
