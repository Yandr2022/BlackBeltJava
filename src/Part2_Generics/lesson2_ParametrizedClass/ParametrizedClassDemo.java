package Part2_Generics.lesson2_ParametrizedClass;

public class ParametrizedClassDemo {
    public static void main(String[] args) {

        Info<String> stringInfo = new Info<>("Hello");
        System.out.println(stringInfo);

        Info<Integer> intInfo = new Info<>(12345);
        System.out.println(intInfo);

        Pair<String, Integer> pair = new Pair<>("Hello", 100);
        System.out.println(pair.getValue2() * 2 + pair.getValue1().length());
    }
}

class Info<T> {

    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Info[" +
                "value=" + value +
                ']';
    }
}

class Pair<V1, V2> {

    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}