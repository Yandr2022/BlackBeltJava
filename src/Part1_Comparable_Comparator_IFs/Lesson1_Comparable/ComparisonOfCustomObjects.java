package Part1_Comparable_Comparator_IFs.Lesson1_Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparisonOfCustomObjects {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(10, 32345, "Zaur", "Ivanov"));
        list.add(new Employee(100, 12345, "Ivan", "Petrov"));
        list.add(new Employee(123, 12387, "Elena", "Smirnova"));
        list.add(new Employee(15, 53214, "Yulia", "Petrova"));
        list.add(new Employee(123, 32345, "Zaur", "Sidorov"));

        System.out.println(list + "\n");
        Collections.sort(list);
        System.out.println(list + "\n");

        Employee[] arr = {list.get(2), list.get(0), list.get(3), list.get(1)};
        System.out.println(Arrays.toString(arr) + "\n");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

class Employee implements Comparable<Employee> {

    int id;
    int salary;
    String name;
    String surname;

    public Employee(int id, int salary, String name, String surname) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Employee employee) {
////        return Integer.compare(this.id, employee.id);
////        return (this.id > employee.id) ? 1 : (this.id < employee.id) ? -1 : 0;
//        return this.id - employee.id;
//    }


    @Override
    public int compareTo(Employee employee) {
        int res = this.name.compareTo(employee.name);
        return res != 0 ? res : this.surname.compareTo(surname);
    }
}