package Part6_Streams.lesson2_methodFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Yuli");
        list.add("Ivan");
        list.add("Angelica");
        list.add("Svetlana");
        list.add("Aleksandr");
        list.add("Andrey");
        List<String> list1 = list.stream().filter(el -> el.startsWith("A")).collect(Collectors.toList());
        System.out.println(list1);
    }
}
