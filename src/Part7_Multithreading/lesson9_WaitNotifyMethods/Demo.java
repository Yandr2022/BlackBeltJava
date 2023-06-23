package Part7_Multithreading.lesson9_WaitNotifyMethods;

public class Demo {
    public static void main(String[] args) {
        Market market = new Market();
        Thread thread = new Thread(new Producer(market));
        Thread thread1 = new Thread(new Consumer(market));
        Thread thread2 = new Thread(new Consumer(market));
        thread.start();
        thread1.start();
        thread2.start();


        try {
            thread.join();
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Market close");
    }

}

class Market {
    private int merchandiseCount = 0;

    public Market() {
        System.out.println("Market open");
    }

    public synchronized void getMerch() {
        while (merchandiseCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        merchandiseCount--;
        System.out.println("The customer bought the item");
        System.out.println(merchandiseCount + " item left");
        notify();
    }

    public synchronized void putMerch() {
        while (merchandiseCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        merchandiseCount++;
        System.out.println("The producer has delivered 1 goods");
        System.out.println(merchandiseCount + " item left");
        notify();
    }
}

class Producer implements Runnable {

    private Market market;

    public Producer(Market market) {
        this.market = market;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putMerch();
        }

    }
}

class Consumer implements Runnable {

    private Market market;

    public Consumer(Market market) {
        this.market = market;
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            market.getMerch();
            System.out.println(Thread.currentThread().getName());
        }
    }
}