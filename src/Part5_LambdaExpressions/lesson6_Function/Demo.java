package Part5_LambdaExpressions.lesson6_Function;

import Part5_LambdaExpressions.lesson3_Predicate.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Demo {
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
        System.out.println(avgOfSmth(students,st -> (double)st.getAge()));
    }

    public static double avgOfSmth(List<Student> list, Function<Student, Double> function ){
        double result = 0;
        for (Student st:list) {
            result += function.apply(st);
        }
        return result/list.size();
        
    }
}
