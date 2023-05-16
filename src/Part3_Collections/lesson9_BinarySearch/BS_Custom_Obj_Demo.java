package Part3_Collections.lesson9_BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BS_Custom_Obj_Demo {
    public static void main(String[] args) {

        List<Obj> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add(i % 2 != 0 ? new Obj((char) ('A' + i) + "", i + 1)
                    : new Obj((char) ('K' + i) + "", i - 3));
        }
        list.add(new Obj("J", 1));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, new Obj("M", -1)));
        System.out.println(Collections.binarySearch(list, new Obj("D", 4)));

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list + "\n");


        Obj[] arr = new Obj[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, new Obj("F", 6)));

    }
}

class Obj implements Comparable<Obj> {
    String name;
    int num;

    public Obj(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    @Override
    public int compareTo(Obj o) {
        int res = num - o.num;
        return res != 0 ? res : name.compareTo(o.name);
    }
}