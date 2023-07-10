package Part10_OtherImportantThemes.lesson5_6_Reflection;

public class Emp {

    public int id;
    public String name;
    public String department;
    private double salary =1000;

    public Emp() {
    }

    public Emp(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }


    private void changeDep(String department) {
        this.department = department;
        System.out.println("New department is " + this.department);
    }

    public void increaseSalary() {
        salary *= 2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
