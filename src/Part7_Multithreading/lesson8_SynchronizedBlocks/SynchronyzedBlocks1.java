package Part7_Multithreading.lesson8_SynchronizedBlocks;


import static Part7_Multithreading.lesson8_SynchronizedBlocks.SynchronyzedBlocks1.increment;

public class SynchronyzedBlocks1 {
    volatile static int counter = 0;//or not - optional
    volatile static int counter1 = 0;//or not - optional

    public static synchronized void increment() {
        counter++;
    }
    public static void increment1() {
        synchronized (SynchronyzedBlocks1.class) {
            counter1++;
        }
    }


    public static void main(String[] args) {
         Thread thread = new Thread(()->{ for (int i = 0; i < 1000; i++) {
             increment();
           increment1();
        }});
        Thread thread1= new Thread(()->{ for (int i = 0; i < 1000; i++) {
             increment();
            increment1();
        }});

        thread.start();
        thread1.start();



        try {
            thread.join();
            thread1.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter);
        System.out.println(counter1);

    }
}


