package Part1_Comparable_Comparator_IFs.Lesson2_Comparator;

import java.util.*;

public class ComparisonOfCustomObjects {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(10, 32345, "Zaur", "Ivanov"));
        list.add(new Employee(100, 12345, "Ivan", "Petrov"));
        list.add(new Employee(123, 12345, "Elena", "Smirnova"));
        list.add(new Employee(15, 53214, "Yulia", "Petrova"));
        list.add(new Employee(123, 32345, "Zaur", "Sidorov"));

        System.out.println(list + "\n");
        Collections.sort(list, new SurnameComparator());
        System.out.println(" new SurnameComparator()\n" + list + "\n");

//        Collections.sort(list, (emp1, emp2)-> emp1.name.compareTo(emp2.name));
        Collections.sort(list, Comparator.comparing(emp -> emp.name));
        System.out.println("Comparator.comparing(emp -> emp.name)\n" + list + "\n");

//        Comparator<Employee> comparatorSalary = (emp1, emp2)-> emp1.salary - emp2.salary;
        Comparator<Employee> comparatorSalary = Comparator.comparingInt(emp -> emp.salary);
        Comparator<Employee> comparatorName = Comparator.comparing(emp -> emp.name);
        Collections.sort(list, comparatorSalary.thenComparing(comparatorName));
        System.out.println("comparatorSalary.thenComparing(comparatorName)\n" + list + "\n");


        Employee[] arr = {list.get(2), list.get(0), list.get(3), list.get(1)};
        System.out.println(Arrays.toString(arr) + "\n");
        Arrays.sort(arr, (AnyComparator::compare));
        System.out.println("(AnyComparator::compare)\n" + Arrays.toString(arr));

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

    @Override
    public int compareTo(Employee employee) {
        return this.id - employee.id;
    }
}

class SurnameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.surname.compareTo(emp2.surname);
    }
}

class AnyComparator {
    public static int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}