package Part3_Collections.lesson2_5_MethodsOfArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ALMethodsDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        //add
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        System.out.println(integers);
        integers.add(2, 5);//index<= size
        System.out.println(integers);
        integers.add(integers.size(), 8);
        System.out.println(integers + "\n*******************");

        //get
        for (int i = 0; i < integers.size(); i += 2) {
            System.out.print(integers.get(i) + (i < integers.size() - 2 ? ", " : "\n*******************\n"));
        }

        //set
        System.out.println(integers);
        integers.set(1, 100);
        System.out.println(integers + "\n*******************");

        //remove
        List<Obj> objList = new ArrayList<>();
        objList.add(new Obj("First"));
        objList.add(new Obj("Second"));
        objList.add(new Obj("Thirst"));
        //by Index
        System.out.println(objList);
        Obj remEl = objList.remove(1);
        System.out.println(objList);
        System.out.println(remEl + "\n--------");
        objList.add(remEl);
        //by equals without Overriding
        System.out.println(objList);
        objList.remove(new Obj("Second"));
        System.out.println(objList);
        objList.remove(remEl);
        //by equals with Overriding
        System.out.println(objList);
        objList.add(new OverrideEquals("Child"));
        System.out.println(objList);
        objList.remove(new OverrideEquals("Child"));
        System.out.println(objList + "\n*******************");

        //addAll
        List<String> lettersA = new ArrayList<>();
        lettersA.add("A");
        lettersA.add("A");
        lettersA.add("A");
        List<String> lettersB = new ArrayList<>();
        lettersB.add("B");
        lettersB.add("B");
        lettersB.add("B");
        lettersA.addAll(lettersB);
        System.out.println(lettersA);
        lettersA.addAll(1, lettersB);
        System.out.println(lettersA + "\n*******************");

        //clear
        lettersB.clear();
        System.out.println(lettersB + "\n*******************");

        //removeAll
        lettersB.add("B");
        lettersB.add("A");
        ArrayList<String> mixLetters = new ArrayList<>(lettersA);
        mixLetters.add("G");
        mixLetters.add("E");
        System.out.println(mixLetters);
        mixLetters.removeAll(lettersB);
        System.out.println(mixLetters + "\n*******************");

        //retainAll
        mixLetters.addAll(lettersA);
        System.out.println(mixLetters);
        mixLetters.retainAll(lettersB);
        System.out.println(mixLetters);

        //indexOf
        objList.add(new OverrideEquals("Second"));
        System.out.println(objList);
        Obj first = objList.get(0);
        System.out.println(objList.indexOf(new OverrideEquals("Second")));
        System.out.println(objList.indexOf(new Obj("First")));
        System.out.println(objList.indexOf(first) + "\n--------");
        //lastIndexOf
        System.out.println(lettersA);
        System.out.println(lettersA.indexOf("A"));
        System.out.println(lettersA.lastIndexOf("A") + "\n*******************");

        //size
        System.out.println(lettersA.size() + "\n*******************");

        //isEmpty
        System.out.println(lettersA.isEmpty());
        System.out.println(lettersB.isEmpty() + "\n*******************");

        //contains
        System.out.println(lettersA.contains("B"));
        System.out.println(lettersA.contains("D"));


    }
}

class Obj {
    String name;

    public Obj(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Obj{" +
                "name='" + name + '\'' +
                '}';
    }
}

class OverrideEquals extends Obj {

    public OverrideEquals(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OverrideEquals) {
            return name.equals(((OverrideEquals) obj).name);
        }
        return false;
    }
}