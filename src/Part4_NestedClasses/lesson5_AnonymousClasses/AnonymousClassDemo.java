package Part4_NestedClasses.lesson5_AnonymousClasses;

public class AnonymousClassDemo {
    private int x = 5;

    public static void main(String[] args) {
        Math math = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(math.doOperation(5, 10));

        Math math1 = (a, b) -> a * b;
        System.out.println(math1.doOperation(5, 10));

        Math2 math2 = new Math2() {
            @Override
            public int doOperation(int a, int b) {
                return a - b + new AnonymousClassDemo().x;
            }
        };
        System.out.println(math2.doOperation(5, 10));
    }

}

interface Math {
    int doOperation(int a, int b);
}

class Math2 {
    int doOperation(int a, int b) {
        return a + b;
    }
}