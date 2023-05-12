package Part2_Generics.lesson5_Subtyping;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
//        List<A> list = new ArrayList<B>();Compile time error: incompatible types

        List<Num> numList = new ArrayList<>();
        numList.add(new Num<>((byte) 58));
        numList.add(new Num<>((short) 58));
        numList.add(new Num<>(58));
        numList.add(new Num<>(5.8f));
        numList.add(new Num<>(5.8));
// numList.add(new Num<>("5.8")); cannot infer type arguments  inference variable T has incompatible bounds: java.lang.Number
        for (Num n : numList) {
            System.out.println(n);
        }
    }
}

class A {
}

class B extends A {
}

class Num<T extends Number> {
    private T value;

    public Num(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Num{" +
                "value=" + value +
                ", class= " + value.getClass().getSimpleName() + "}";
    }
}