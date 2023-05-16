package Part3_Collections.lesson9_BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BS_Basic_DT_Demo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(-8);
        list.add(-2);
        list.add(-0);
        list.add(8);
        list.add(30);
        list.add(-24);
        list.add(150);
        list.add(2);
        list.add(4);
        list.add(-12);
        list.add(19);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, 2) + "\n");

        String str = "JavaWillSaveTheWorld";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(str + "\n" + Arrays.toString(ch) + "\n" + Arrays.binarySearch(ch, 'h'));
//        List<Character> list1 = new ArrayList<>();
//        for (char c:str.toCharArray()) {
//            list1.add(c);
//        }
//        System.out.println(list1);
//        Collections.sort(list1);
//        System.out.println(list1);
//        System.out.println(Collections.binarySearch(list1,'r'));

    }
}
