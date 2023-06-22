package Part7_Multithreading.lesson7_DataRace_SynchronizedMeths;

public class DataRace1 {
    volatile static int counter = 0;//or not - optional
    volatile static int counter1 = 0;//or not - optional

     public static synchronized void increment() {
        counter++;
    }
    public static  void increment1() {
        counter1++;
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable2());
        Thread thread1 = new Thread(new MyRunnable2());

        Thread thread3 = new Thread(()->{ for (int i = 0; i < 1000; i++) {
            DataRace1.increment1();
        }});
        Thread thread4= new Thread(()->{ for (int i = 0; i < 1000; i++) {
            DataRace1.increment1();
        }});

        thread.start();
        thread1.start();

        thread4.start();
        thread3.start();

        try {
            thread.join();
            thread1.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter);
        System.out.println(counter1);

    }
}

class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            DataRace1.increment();
        }
    }
}