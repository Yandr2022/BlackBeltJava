package Part6_Stream_API.lesson15_17_MethsLimitSkipMapToInt;

import Part5_LambdaExpressions.lesson3_Predicate.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        students.stream().filter(st -> st.getAge() >= 20).forEach(System.out::println);
        System.out.println();
        students.stream().filter(st -> st.getAge() >= 20).limit(2).forEach(System.out::println);
        System.out.println();
        students.stream().filter(st -> st.getAge() >= 20).skip(2).forEach(System.out::println);
        System.out.println();

        int[] coursesArr = students.stream().mapToInt(st -> st.getCourse()).toArray();
        System.out.println(Arrays.toString(coursesArr));

        List<Integer> coursesList = students.stream().mapToInt(st -> st.getCourse()).boxed().collect(Collectors.toList());
        System.out.println(coursesList + "\n");

        double[] gradesArr = students.stream().mapToDouble(st -> st.getAvgGrade()).toArray();
        System.out.println(Arrays.toString(gradesArr));

        List<Double> gradesList = students.stream().mapToDouble(st -> st.getAvgGrade()).boxed().collect(Collectors.toList());
        System.out.println(gradesList + "\n");

        double sumGrades = students.stream().mapToDouble(st -> st.getAvgGrade()).sum();
        System.out.println("sum of Grades: " + sumGrades);

        double avgAge = students.stream().mapToInt(st -> st.getAge()).average().getAsDouble();
        System.out.println("avg Age of Students: " + String.format("%.2f", avgAge));

        System.out.printf("minimal from Students Grades: %.2f\n", students.stream()
                .mapToDouble(st -> st.getAvgGrade()).min().getAsDouble());

        System.out.printf("maximal from Students Ages: %d", students.stream()
                .mapToInt(st -> st.getAge()).max().getAsInt());


    }
}
