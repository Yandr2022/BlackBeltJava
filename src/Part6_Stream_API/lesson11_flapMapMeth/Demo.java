package Part6_Stream_API.lesson11_flapMapMeth;

import Part5_LambdaExpressions.lesson3_Predicate.Student;

import java.util.ArrayList;
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

        Faculty faculty = new Faculty("Economics");
        Faculty faculty1 = new Faculty("Applied Mathematics");

        faculty.addStudentToFaculty(student,student1,student2);
        faculty1.addStudentToFaculty(student3,student4,student5);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty);
        faculties.add(faculty1);

        faculties.stream().flatMap(fac->fac.getStudentsOfFaculty().stream()).forEach(st-> System.out.println(st.getName()));

    }

}

class Faculty{
    private String name;
    private List<Student> studentsOfFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOfFaculty = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentsOfFaculty() {
        return studentsOfFaculty;
    }

    public void addStudentToFaculty(Student... students){
        for (Student st:students
             ) {
            studentsOfFaculty.add(st);
        }

    }
}