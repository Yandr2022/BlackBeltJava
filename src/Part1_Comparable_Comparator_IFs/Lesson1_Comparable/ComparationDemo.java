package Part1_Comparable_Comparator_IFs.Lesson1_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparationDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Yulia");
        list.add("Ivan");
        list.add("Elena");
        list.add("Wladimir");
        System.out.println(list);
        Collections.sort(list);//natural sort
        System.out.println(list);
    }
}
