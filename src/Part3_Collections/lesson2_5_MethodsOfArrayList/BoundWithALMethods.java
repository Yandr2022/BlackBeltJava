package Part3_Collections.lesson2_5_MethodsOfArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoundWithALMethods {
    public static void main(String[] args) {
        //Arrays.asList
        StringBuilder[] arr = {new StringBuilder("a"), new StringBuilder("b"), new StringBuilder("c")};
        List<StringBuilder> list = Arrays.asList(arr);
        System.out.println(list);
        arr[0].append("!");
        System.out.println(list);
//        list.remove(1); UnsupportedOperationException
        list.get(1).append("!!");
        System.out.println(list + "\n******************");


    }
}
