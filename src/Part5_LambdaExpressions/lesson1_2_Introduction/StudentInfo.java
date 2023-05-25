package Part5_LambdaExpressions.lesson1_2_Introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentInfo {
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

        printStudentOverGrade(students, 8);
        System.out.println("*******************");
        printStudentUnderAge(students, 23);
        System.out.println("*******************");
        printStudentMixCondition(students, 21, 7, 'f');
        System.out.println("*******************");
        printStudents(students, new UnderGrade());
        System.out.println("*******************");
        printStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student st) {
                return st.name.startsWith("D");
            }
        });

        System.out.println("*******************");
        printStudents(students, st -> st.sex == 'f' && st.course < 2);
        System.out.println("*******************");

        StudentChecks[] checks = {st -> st.sex == 'm', st -> st.age > 25, st -> st.course > 2 && st.avgGrade > 9};
        for (StudentChecks check : checks) {
            printStudents(students, check);
            System.out.println("*******************");

        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course - o2.course;
            }
        });

        System.out.println(students);

//        Collections.sort(students, (st1, st2)-> st1.name.compareTo(st2.name));
        Collections.sort(students, Comparator.comparing(st -> st.name));
        System.out.println(students);

    }

    static void printStudentOverGrade(List<Student> studentList, double grade) {
        for (Student st : studentList) {
            if (st.avgGrade > grade) {
                System.out.println(st);
            }
        }

    }

    static void printStudentUnderAge(List<Student> studentList, int age) {
        for (Student st : studentList) {
            if (st.age < age) {
                System.out.println(st);
            }
        }

    }

    static void printStudentMixCondition(List<Student> studentList, int age, double grade, char sex) {
        for (Student st : studentList) {
            if (st.age > age && st.avgGrade < grade && st.sex == sex) {
                System.out.println(st);
            }
        }

    }

    static void printStudents(List<Student> studentList, StudentChecks checks) {
        for (Student st : studentList) {
            if (checks.check(st)) {
                System.out.println(st);
            }
        }

    }
}

interface StudentChecks {
    boolean check(Student s);
}

class UnderGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade < 8;
    }
}