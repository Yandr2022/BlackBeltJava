package Part6_Stream_API.lesson12_collectGrouping_Partitioning;


import Part5_LambdaExpressions.lesson3_Predicate.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

        Map<Integer, List<Student>> map = students.stream().map(st -> {
            st.setName(st.getName().toUpperCase());
            return st;
        }).collect(Collectors.groupingBy(el -> el.getCourse()));

        System.out.println(map);
        System.out.println();
        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
        Map<Boolean, List<Student>> booleanListMap = students.stream()
                .collect(Collectors.partitioningBy(st -> st.getAvgGrade() > 8));

        for (Map.Entry<Boolean, List<Student>> entry : booleanListMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
