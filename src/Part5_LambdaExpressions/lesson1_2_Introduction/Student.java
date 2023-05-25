package Part5_LambdaExpressions.lesson1_2_Introduction;



    public class Student{
    String name;
    char sex;
    int course;
    int age;
    double avgGrade;

    public Student(String name, char sex, int course, int age, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.course = course;
        this.age = age;
        this.avgGrade = avgGrade;
    }

    public Student() {
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
