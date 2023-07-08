package Part9_RegEx.lesson7_printfAndFormatMethods;

public class Demo {
    static void infoPrint(Employee emp) {
        System.out.printf("%03d \t %-12s \t %-18s \t %,.1f \n"
                , emp.id, emp.name, emp.surname, emp.salary * (1 + emp.bonusPct));
    }

    public static void main(String[] args) {

        Employee[] employees = {new Employee(1, "Yuli", "Andryushchenko", 2000, 0.38)
                , new Employee(2, "Ivan", "Andryushchenko", 2500, 0.25)
                , new Employee(28, "Igor", "Ivanov", 1800, 0.15),
                new Employee(3258, "Svetlana", "Smirnova", 1200, 0.09)};

        for (Employee emp : employees
        ) {
            infoPrint(emp);
        }

        String str = String.format("\n%03d \t %-12s \t %-18s \t %,.1f \n", employees[1].id, employees[1].name
                , employees[1].surname, employees[1].salary * (1 + employees[1].bonusPct));
        System.out.println(str);
    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }


}