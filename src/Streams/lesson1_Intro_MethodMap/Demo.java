package Streams.lesson1_Intro_MethodMap;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ABCde");
        list.add("defG");
        list.add("GHIjklmn");
        list.add("jklmnopQrSt");

        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

//        list.replaceAll(s -> String.valueOf(s.length()));

        List<Integer> integerList = list.stream().map(el -> el.length()).collect(Collectors.toList());
        System.out.println(integerList);


        int [] arr = {2, 18, 26, 5, -4, 21};
        arr = Arrays.stream(arr).map(el -> el % 3 == 0 ? el / 3 : el).toArray();
        System.out.println(Arrays.toString(arr));

        Set<String> strings = new TreeSet<>();
        strings.add("ABCde");
        strings.add("defG");
        strings.add("GHIjklmn");
        strings.add("jklmnopQrSt");
        System.out.println(strings);

        Set<Integer> set = strings.stream().map(el ->el.length()).collect(Collectors.toSet());
        System.out.println(set);


    }
}
