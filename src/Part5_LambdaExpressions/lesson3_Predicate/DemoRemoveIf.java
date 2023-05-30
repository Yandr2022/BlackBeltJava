package Part5_LambdaExpressions.lesson3_Predicate;

import java.util.ArrayList;
import java.util.List;

public class DemoRemoveIf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Goodbye");
        list.add("Learn Java");
        list.add("Yuli");
        list.add("bad");
        list.add("ok");
        System.out.println(list);
        list.removeIf(str -> str.length() < 5);
        System.out.println(list);
        list.removeIf(str->str.startsWith("G"));
        System.out.println(list);


    }
}
