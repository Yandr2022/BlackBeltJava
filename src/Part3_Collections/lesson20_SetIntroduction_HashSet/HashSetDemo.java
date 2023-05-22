package Part3_Collections.lesson20_SetIntroduction_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Yuli");
        stringSet.add("Ivan");
        stringSet.add(null);
        System.out.println(stringSet.add("Serg"));
        System.out.println(stringSet.add("Serg"));

        for (String s : stringSet
        ) {
            System.out.println(s);
        }
        stringSet.remove(null);
        System.out.println(stringSet);
        System.out.println(stringSet.size());
        System.out.println(stringSet.isEmpty());
        System.out.println(stringSet.contains("Serg"));
    }
}
