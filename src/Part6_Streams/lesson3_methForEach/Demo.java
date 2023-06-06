package Part6_Streams.lesson3_methForEach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class
Demo {
    public static void main(String[] args) {
        int[] ar = {4, 8, 2, 3, 6, 7};

        Arrays.stream(ar).forEach(el -> System.out.println(el * 2));

        Arrays.stream(ar).forEach(System.out::println);//method reference

        Stream<String> stream = Stream.of("you", "i", "we", "he", "it");
        List<String> list = stream.filter(el -> el.length() >= 2).collect(Collectors.toList());
        System.out.println(list);
    }
}
