package Part3_Collections.lesson1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreating {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();//default capacity = 10, size = 0
        strings.add("Yuli");
        strings.add("Ivan");
        strings.add("Maria");
        System.out.println(strings);

        List<Integer> integers = new ArrayList<>(20);//capacity = 20, size = 0
        for (int i = 0; i <20 ; i++) {
            integers.add(i);
        }
        System.out.println(integers);

        List<Integer> integers1 = new ArrayList<>(integers);//deep copy
        System.out.println(integers1);
        System.out.println(integers == integers1);

        List rawList = new ArrayList();
        rawList.add(7);
        rawList.add("str");
        rawList.add(new Obj());
        System.out.println(rawList);



    }
}

class Obj{
    String name = "any Object";

    @Override
    public String toString() {
        return "Obj{" +
                "name='" + name + '\'' +
                '}';
    }
}