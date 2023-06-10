package Part6_Streams.lesson6_MethChaining;

import Part5_LambdaExpressions.lesson3_Predicate.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int res = Arrays.stream(arr).filter(el -> el % 2 != 0).map(el -> el % 3 == 0 ? el / 3 : el).reduce((acc, el) -> acc + el).getAsInt();
        System.out.println(res);

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

        students.stream().filter(el -> el.getSex() == 'f').sorted(Comparator.comparingInt(Student::getAge))
                .map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                }).forEach(System.out::println);

        Stream<Integer> stream = Stream.of(1, 8, 3, 7, 20, 5);
        stream.filter(el -> {
            System.out.println("!!!");
            return el % 2 == 0;
        });//will not be executed because the filter method is lazy -> waiting for a terminal method call


    }
}
