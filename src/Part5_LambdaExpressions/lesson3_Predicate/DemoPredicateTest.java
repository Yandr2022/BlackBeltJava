package Part5_LambdaExpressions.lesson3_Predicate;


import java.util.ArrayList;

import java.util.List;
import java.util.function.Predicate;

public class DemoPredicateTest {
    public static void main(String[] args) {

        Student student = new Student("Ivan", 'm', 2, 23, 7.5);
        Student student1 = new Student("Maria", 'f', 1, 19, 8.7);
        Student student2 = new Student("Sergey", 'm', 2, 31, 9.2);
        Student student3 = new Student("Laura", 'f', 3, 24, 6.2);
        Student student4 = new Student("Dmitriy", 'm', 4, 25, 8.2);
        Student student5 = new Student("Irina", 'f', 5, 27, 10);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        showStudentsByCondition(students, (st) -> st.getCourse() > 2);

        Predicate<Student> predicate = (st) -> st.getAvgGrade() >= 7.5;
        Predicate<Student> predicate1 = st -> st.getSex() == 'm';
        System.out.println();

        showStudentsByCondition(students, predicate1.and(predicate));

        System.out.println();
        showStudentsByCondition(students, predicate1.negate().and(predicate));


    }

    static void showStudentsByCondition(List<Student> students, Predicate<Student> predicate) {
        for (Student st : students) {
            if (predicate.test(st)) {
                System.out.println(st);
            }
        }
    }
}
