package Part3_Collections.lesson20_SetIntroduction_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {
    public static void main(String[] args) {
        Set<Integer> integerSet1 = new HashSet<>();
        integerSet1.add(5);
        integerSet1.add(7);
        integerSet1.add(10);
        integerSet1.add(2);
        integerSet1.add(3);
        System.out.println(integerSet1);

        Set<Integer> integerSet2 = new HashSet<>();
        integerSet2.add(5);
        integerSet2.add(7);
        integerSet2.add(4);
        integerSet2.add(8);
        integerSet2.add(3);
        System.out.println(integerSet2);

        HashSet<Integer> union = new HashSet<>(integerSet1);
        union.addAll(integerSet2);
        System.out.println(union);

        HashSet<Integer> intersect = new HashSet<>(integerSet1);
        intersect.retainAll(integerSet2);
        System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(integerSet1);
        subtract.removeAll(integerSet2);
        System.out.println(subtract);





    }
}
