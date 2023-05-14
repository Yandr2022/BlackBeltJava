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

        //List.of
        List<Integer> integerList = List.of(1, 8, 13);
        System.out.println(integerList);
//        integerList.add(2); UnsupportedOperationException: ImmutableCollections

        // List.copyOf
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 100; i < 110; i++) {
            stringArrayList.add(((char) i) + "");
        }
//        stringArrayList.add(null);.NullPointerException: requireNonNull
        List<String> stringList = List.copyOf(stringArrayList);
        System.out.println(stringList);
//       stringList.add("a"); UnsupportedOperationException: ImmutableCollections
    }
}
