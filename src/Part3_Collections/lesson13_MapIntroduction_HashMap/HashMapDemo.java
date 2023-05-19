package Part3_Collections.lesson13_MapIntroduction_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(2154, "Yuli");
        map.put(3258, "Ivan");
        map.put(null, "Ivan");
        map.put(404, null);
        map.put(4896, "Svetlana");
        map.put(1358, "Svetlana");
        System.out.println(map.put(9653, "Andrey"));
        System.out.println(map.put(9653, "Georgiy"));

        System.out.println(map.putIfAbsent(3258, "Ivan2"));
        System.out.println(map.putIfAbsent(32581, "Ivan2"));
        System.out.println(map);

        System.out.println(map.get(2154));

        System.out.println(map.remove(9653));
        System.out.println(map);

        System.out.println(map.containsValue("Ivan"));
        System.out.println(map.containsKey(404));


        Set<Integer> setK = map.keySet();
        Collection<String> setV = map.values();
        System.out.println(setK);
        System.out.println(setV);
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println(entrySet);

    }
}
