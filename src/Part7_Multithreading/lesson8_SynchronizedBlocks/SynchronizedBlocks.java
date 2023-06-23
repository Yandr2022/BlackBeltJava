package Part7_Multithreading.lesson8_SynchronizedBlocks;

public class SynchronizedBlocks {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
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


    public static synchronized void increment() {
        System.out.print(Counter.count++ + " ");
    }
}

class MyRunnable implements Runnable {

    private void labelPrint(){
        System.out.println("not synchronized block");
    }

    private  void increment() {
        labelPrint();
        synchronized (this) {
            System.out.println(Counter.count++ + " ");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
//            Counter.increment();
            increment();
        }
    }
}
