package Part3_Collections.lesson11_Vector;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> strings = new Vector<>();
        for (int i = 0; i < 10; i++) {
            strings.add((char) ('A' + i) + "");
        }
        Collections.shuffle(strings);
        System.out.println(strings);
        System.out.println(strings.firstElement());
        System.out.println(strings.lastElement());
        System.out.println(strings.get(3));
        for (int i = 2; i < 5; i++) {
            strings.remove(i);
        }
        System.out.println(strings);

    }
}
