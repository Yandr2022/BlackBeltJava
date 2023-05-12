package Part2_Generics.lesson4_ExampleWithGenerics;

import Part2_Generics.lesson4_ExampleWithGenerics.entity.Employee;
import Part2_Generics.lesson4_ExampleWithGenerics.entity.Schoolchild;
import Part2_Generics.lesson4_ExampleWithGenerics.entity.Student;
import Part2_Generics.lesson4_ExampleWithGenerics.entity.Team;
import Part2_Generics.lesson4_ExampleWithGenerics.entity.abstraction.Participant;

public class Demo {
    public static void main(String[] args) {

        Team<Schoolchild> schoolTeam1 = new Team<>("Dragons");
        schoolTeam1.addNewParticipant(new Schoolchild("Ivan", 13));
        schoolTeam1.addNewParticipant(new Schoolchild("Mariya", 15));
        System.out.println();
        Team<Schoolchild> schoolTeam2 = new Team<>("T-Rex");
        schoolTeam2.addNewParticipant(new Schoolchild("Sergey", 12));
        schoolTeam2.addNewParticipant(new Schoolchild("Lusia", 14));
        System.out.println();
        schoolTeam1.playWith(schoolTeam2);
        System.out.println("***************************");

        Team<Student> studentTeam1 = new Team<>("Tigers");
        studentTeam1.addNewParticipant(new Student("Irina", 20));
        studentTeam1.addNewParticipant(new Student("Oleg", 18));
        System.out.println();
        Team<Student> studentTeam2 = new Team<>("Lions");
        studentTeam2.addNewParticipant(new Student("Larisa", 19));
        studentTeam2.addNewParticipant(new Student("Evgeniy", 19));
        System.out.println();
        studentTeam1.playWith(studentTeam2);
        System.out.println("***************************");

        Team<Employee> employeeTeam1 = new Team<>("Free_Birds");
        employeeTeam1.addNewParticipant(new Employee("Olga", 25));
        employeeTeam1.addNewParticipant(new Employee("Igor", 24));
        System.out.println();
        Team<Employee> employeeTeam2 = new Team<>("Flying_Fish");
        employeeTeam2.addNewParticipant(new Employee("Irma", 25));
        employeeTeam2.addNewParticipant(new Employee("Misha", 24));
        System.out.println();
        employeeTeam1.playWith(employeeTeam2);
        System.out.println("***************************");

        Team<Participant> familyTeam1 = new Team<>("Rainbow");
        familyTeam1.addNewParticipant(new Employee("Alex", 28));
        familyTeam1.addNewParticipant(new Schoolchild("Max", 10));
        System.out.println();
        Team<Participant> familyTeam2 = new Team<>("Summer");
        familyTeam2.addNewParticipant(new Student("Natali", 24));
        familyTeam2.addNewParticipant(new Schoolchild("Kira", 6));
        System.out.println();
        familyTeam1.playWith(familyTeam2);


    }
}
