package Part6_Stream_API.lesson13_14_MethsFindFirstMinMax;

import Part5_LambdaExpressions.lesson3_Predicate.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student("Ivan", 'm', 2, 23, 7.5);
        Student student1 = new Student("Maria", 'f', 1, 19, 8.7);
        Student student2 = new Student("Sergey", 'm', 2, 31, 9.2);
        Student student3 = new Student("Laura", 'f', 3, 24, 6.2);
        Student student4 = new Student("Dmitriy", 'm', 4, 25, 8.2);
        Student student5 = new Student("Irina", 'f', 5, 27, 10);
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Student student6 = students.stream().filter(el -> el.getSex() == 'f').sorted(Comparator.comparingInt(Student::getAge))
                .map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                }).findFirst().get();
        System.out.println(student6 + "\n");

        Student studentMinAge = students.stream().min(Comparator.comparingInt(Student::getAge)).get();
        Student studentMinGrade = students.stream().min(Comparator.comparingDouble(Student::getAvgGrade)).get();
        System.out.println("min age: " + studentMinAge + "\n" + "min grade: " + studentMinGrade + "\n");

        Student studentMaxAge = students.stream().max(Comparator.comparingInt(Student::getAge)).get();
        Student studentMaxGrade = students.stream().max(Comparator.comparingDouble(Student::getAvgGrade)).get();
        System.out.println("max age: " + studentMaxAge + "\n" + "max grade: " + studentMaxGrade);
    }
}
