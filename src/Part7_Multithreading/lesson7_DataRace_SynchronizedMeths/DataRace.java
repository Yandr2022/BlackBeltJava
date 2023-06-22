package Part7_Multithreading.lesson7_DataRace_SynchronizedMeths;

public class DataRace {
    public static void main(String[] args) {
        MyRunnable1 runnable = new MyRunnable1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;


    public static void increment() {
        System.out.print(Counter.count++ + " ");
    }

    public static synchronized void increment1() {
        System.out.print(Counter.count++ + " ");
    }
}

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            Counter.increment();
        }
    }
}