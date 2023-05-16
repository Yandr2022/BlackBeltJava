package Part3_Collections.lesson12_Stack;

public class StackDemo {
    static  void foo(){
        System.out.println("foo start");
        System.out.println("foo end");
    }

    static  void foo1(){
        System.out.println("foo1 start");
        foo();
        System.out.println("foo1 end");
    }

    static  void foo2(){
        System.out.println("foo2 start");
        foo1();
        System.out.println("foo2 end");
    }
    public static void main(String[] args) {
        System.out.println("main starts");
        foo2();
        System.out.println("main ends");

    }
}
