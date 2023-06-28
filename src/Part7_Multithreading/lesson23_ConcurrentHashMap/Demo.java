package Part7_Multithreading.lesson23_ConcurrentHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Demo {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Yuli");
        map.put(2, "Ivan");
        map.put(3, "Sergey");
        map.put(4, "Oleg");
        map.put(5, "Svetlana");

        Runnable runnable = () -> {

            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.printf("%d: %s\n", i, map.get(i));
            }
        };

        Runnable runnable1 = () -> {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               map.put(6, "Natali");
            };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);

        thread.start();
        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(map);
    }
}
