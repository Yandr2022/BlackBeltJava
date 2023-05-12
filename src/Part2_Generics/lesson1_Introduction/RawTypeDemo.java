package Part2_Generics.lesson1_Introduction;

import java.util.ArrayList;

public class RawTypeDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add('a');
        list.add("jkl;");
        list.add(2);
        list.add("vbnmcv");
        for (Object o : list) {
            System.out.println(o + " " + ((o instanceof String) ? ((String) o).length() : "wrong type"));
        }
    }
}
