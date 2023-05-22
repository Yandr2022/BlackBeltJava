package Part3_Collections.lesson21_TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(-8);
        set.add(120);
        set.add(10);
        set.add(0);
//        set.add(null);
        System.out.println(set);

        System.out.println(set.remove(2));
        System.out.println(set);
        System.out.println(set.contains(10));

        TreeSet<Integer> set1 = new TreeSet<>((num, num1) -> num1 - num);
        set1.add(2);
        set1.add(-8);
        set1.add(120);
        set1.add(10);
        set1.add(0);
        System.out.println(set1);

        System.out.println(set1.first());
        System.out.println(set1.last());
        System.out.println(set1.headSet(0));
        System.out.println(set1.tailSet(0));
        System.out.println(set1.subSet(120,-8));




    }

}
