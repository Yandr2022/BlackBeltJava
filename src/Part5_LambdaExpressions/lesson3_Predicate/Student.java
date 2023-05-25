package Part5_LambdaExpressions.lesson3_Predicate;


public class Student {
    private String name;
    private char sex;
    private int course;
    private int age;
    private double avgGrade;

    public Student(String name, char sex, int course, int age, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.course = course;
        this.age = age;
        this.avgGrade = avgGrade;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", course=" + course +
                ", age=" + age +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
