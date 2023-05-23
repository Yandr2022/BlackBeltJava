package Part3_Collections.lesson25_Deque_ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addFirst(9);
        deque.addLast(1);
        deque.addLast(14);
        deque.offerFirst(8);
        deque.offerLast(10);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

    }
}
