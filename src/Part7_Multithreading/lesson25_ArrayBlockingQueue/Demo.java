package Part7_Multithreading.lesson25_ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
//        queue.add(5);IllegalStateException: Queue full
        queue.offer(5);// don't added
        System.out.println(queue);
    }
}
