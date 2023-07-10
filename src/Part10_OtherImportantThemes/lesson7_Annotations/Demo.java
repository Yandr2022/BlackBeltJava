package Part10_OtherImportantThemes.lesson7_Annotations;

public class Demo {
    public static void main(String[] args) {
Parent parent = new Child("child");
parent.showInfo();
    }
}
class Parent{
    String name;

    public Parent(String name) {
        this.name = name;
    }
@Deprecated
    void showInfo(){
        System.out.println("It's Parent class. Name = " + name);
    }
}

class Child extends Parent{

    public Child(String name) {
        super(name);
    }
@Override
    void showInfo(){
        System.out.println("It's Child class. Name = " + name);
    }
}