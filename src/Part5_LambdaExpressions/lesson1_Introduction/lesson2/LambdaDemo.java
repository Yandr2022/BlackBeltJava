package Part5_LambdaExpressions.lesson1_Introduction.lesson2;

public class LambdaDemo {

    static void foo1(I i){
        System.out.println(i.foo("Hello"));
    }

    public static void main(String[] args) {
        foo1((s -> s.length()));
    }
}

interface I{
    int foo(String s);
}