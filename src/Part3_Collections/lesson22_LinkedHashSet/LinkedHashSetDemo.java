package Part3_Collections.lesson22_LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(0);
        set.add(-7);
        set.add(2);
        System.out.println(set);
        System.out.println(set.remove(0));
        System.out.println(set);
        System.out.println(set.contains(10));
        System.out.println(set.contains(-7));
    }
}
