package Part4_NestedClasses.lesson4_LocalInnerClasses;

public class LocalInnerDemo2 {

    public static void main(String[] args) {
        class Summation implements Math2 {

            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }

        Summation summation = new Summation();
        System.out.println(summation.doOperation(2, 3));
    }
}

interface Math2 {
    int doOperation(int a, int b);
}