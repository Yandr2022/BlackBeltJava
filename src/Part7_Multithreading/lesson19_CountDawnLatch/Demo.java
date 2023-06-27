package Part7_Multithreading.lesson19_CountDawnLatch;

import java.util.concurrent.CountDownLatch;

public class Demo {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Store Staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch: " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so lets open Store");
        countDownLatch.countDown();
        System.out.println("countDownLatch: " + countDownLatch.getCount());
    }

    private static void openStore() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Store is opened");
        countDownLatch.countDown();
        System.out.println("countDownLatch: " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        Buyer buyer = new Buyer("Yuli", countDownLatch);
        Buyer buyer1 = new Buyer("Ivan", countDownLatch);
        Buyer buyer2 = new Buyer("Natalie", countDownLatch);
        Buyer buyer3 = new Buyer("Sergey", countDownLatch);
        Buyer buyer4 = new Buyer("Anna", countDownLatch);
        marketStaffIsOnPlace();
        everythingIsReady();
        openStore();
    }
}

class Buyer extends Thread {
    String name;
    private CountDownLatch count;

    public Buyer(String name, CountDownLatch count) {
        this.name = name;
        this.count = count;
        start();
    }

    @Override
    public void run() {
        try {
            count.await();
            System.out.println(name + " start to buy");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
