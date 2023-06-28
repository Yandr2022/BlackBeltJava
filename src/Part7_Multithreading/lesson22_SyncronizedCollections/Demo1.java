package Part7_Multithreading.lesson22_SyncronizedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            source.add(i + 1);
        }

        List<Integer> synchList = Collections.synchronizedList(source);

        Runnable runnable1 = () -> {
//            Iterator<Integer> iterator = source.iterator();
            synchronized (synchList){
            Iterator<Integer> iterator = synchList.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            }
        };
//        Runnable runnable2 = () -> source.remove(10);
        Runnable runnable2 = () -> synchList.remove(10);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(synchList);
    }


}
