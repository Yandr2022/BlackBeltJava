package Part5_LambdaExpressions.lesson4_5_Supplier_Consumer;

import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "Bye", "Yulia");
        list.forEach(str -> System.out.println(str));

        List<Integer> integers = List.of(2, 5, 7, 9, 12);
        integers.forEach(num -> {
                    System.out.println(num);
                    num *= 2;
                    System.out.println(num);
                }
        );
    }
}
