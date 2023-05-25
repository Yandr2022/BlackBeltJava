package Part5_LambdaExpressions.lesson1_2_Introduction;

public class LambdaDemo {

    static void foo1(I i) {
        System.out.println(i.foo("Hello"));
    }

    public static void main(String[] args) {
        int i = 10;
        foo1((s -> s.length() + i));
    }
}

interface I {
    int foo(String s);
}