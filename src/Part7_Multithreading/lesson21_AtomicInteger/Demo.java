package Part7_Multithreading.lesson21_AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo {
//    static int counter = 0;
    static AtomicInteger counter = new AtomicInteger(0);// default - 0

    public static void increment() {
//        counter++;
//        counter.incrementAndGet();
        counter.addAndGet(-5);
    }

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });
        thread.start();
        thread1.start();
        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }

}
