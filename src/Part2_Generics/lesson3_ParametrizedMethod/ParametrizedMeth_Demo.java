package Part2_Generics.lesson3_ParametrizedMethod;

import java.util.ArrayList;

import static Part2_Generics.lesson3_ParametrizedMethod.GenMeth.getSecondElement;

public class ParametrizedMeth_Demo {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(getSecondElement(list)+2);
    }
}

class GenMeth {
    public static <T> T getSecondElement(ArrayList<T> list) {
        return list.get(1);
    }
}