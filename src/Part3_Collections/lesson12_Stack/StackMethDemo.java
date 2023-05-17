package Part3_Collections.lesson12_Stack;

import java.util.Stack;

public class StackMethDemo {
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        for (int i = 0; i < 10; i++) {
            strings.push((char) ('A' + i) + "");
        }

        System.out.println(strings);

        System.out.println(strings.peek());

        System.out.println(strings);

        while (!strings.isEmpty()) {
            System.out.println(strings.pop());
            System.out.println(strings);
        }


    }
}
