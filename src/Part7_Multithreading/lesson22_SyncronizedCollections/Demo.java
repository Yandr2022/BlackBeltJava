package Part7_Multithreading.lesson22_SyncronizedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i + 1);
        }

        ArrayList<Integer> target = new ArrayList<>();
        List<Integer> synchTarget = Collections.synchronizedList(new ArrayList<>());

        Runnable runnable = () -> target.addAll(source);
        Runnable synchRunnable = () -> synchTarget.addAll(source);

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread sThread = new Thread(synchRunnable);
        Thread sThread1 = new Thread(synchRunnable);

        thread.start();
        thread1.start();
        sThread.start();
        sThread1.start();

        try {
            thread.join();
            thread1.join();
            sThread.join();
            sThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(source);
        System.out.println(target);
        System.out.println(synchTarget);

    }
}
