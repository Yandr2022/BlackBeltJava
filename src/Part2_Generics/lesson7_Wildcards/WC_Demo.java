package Part2_Generics.lesson7_Wildcards;

import java.util.ArrayList;
import java.util.List;

public class WC_Demo {
    public static void main(String[] args) {
        List<Number> numbers;
//        numbers = new ArrayList<Integer>();
        List<?> values;
        values = new ArrayList<Integer>();
        values = new ArrayList<String>();


        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(5);
        integers.add(10);
        integers.add(15);
        showListInfo(integers);

        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        showListInfo(strings);

        System.out.println("***********");
        double sum = sum((ArrayList) integers);
        System.out.println(sum);

    }

    static void showListInfo(List<?> list) {
        System.out.println(list);
    }

    static double sum(ArrayList<? extends Number> numbers) {
        double sum = 0;
        for (Number n : numbers) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
