package Part6_Stream_API.lesson4_ReduceMeth;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(-7);
        list.add(40);
        list.add(82);
        list.add(1);

        System.out.println(list);
        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();
        System.out.println(result);
        int result_ = list.stream().reduce(3, (accumulator, element) -> accumulator * element);
        System.out.println(result_);

        boolean seen = false;
        Integer acc = null;
        for (Integer integer : list) {
            if (!seen) {
                seen = true;
                acc = integer;
            } else {
                acc = acc + integer;
            }
        }
        int result1 = (seen ? Optional.of(acc) : Optional.<Integer>empty()).get();

        System.out.println(result1);

        List<Integer> integers = new ArrayList<>();
        Optional<Integer> res = integers.stream().reduce((accumulator, el) -> accumulator + el);
        int result2 = res.isPresent() ? res.get() : 0;
        System.out.println(result2);


        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        String s = strings.stream().reduce("Alphabet: ", (accumulator, el) -> accumulator + el);
        System.out.println(s);
    }
}
