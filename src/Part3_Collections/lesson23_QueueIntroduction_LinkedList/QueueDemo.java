package Part3_Collections.lesson23_QueueIntroduction_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Yuli");
        queue.add("Ivan");
        queue.add("Svetlana");
        queue.offer("Georgiy");//without IllegalStateException
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.poll());//without NoSuchElementException
        System.out.println(queue);
        System.out.println(queue.element());

    }
}
