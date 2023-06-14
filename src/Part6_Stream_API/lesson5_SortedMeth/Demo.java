package Part6_Stream_API.lesson5_SortedMeth;

import Part5_LambdaExpressions.lesson3_Predicate.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {3, 5, -8, 16, -122, 0, 65, 94, 5};
        arr = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr));

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
        System.out.println(students+"\n");
        students = students.stream().sorted(Comparator.comparingInt(Student::getAge)).collect(Collectors.toList());
        System.out.println(students);
    }
}
