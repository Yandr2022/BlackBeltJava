package Part3_Collections.lesson24_PriorityQueue;

import java.util.PriorityQueue;

public class NaturalPriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(4);
        queue.add(1);
        queue.add(7);
        queue.add(10);
        queue.add(-8);
        System.out.println(queue);
        System.out.println(queue.peek());

    }
}
