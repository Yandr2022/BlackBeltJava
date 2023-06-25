package Part7_Multithreading.lesson11_IFLock_ClassReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo {

    public static void main(String[] args) {
        Thread threads[] = {new Thread(Call::mobileCall),new Thread(Call::skypeCall),new Thread(Call::whatsappCall)};

        for (Thread thread:threads) {
            thread.start();
        }
    }
}

class Call {

    private static Lock lock = new ReentrantLock();

    static void mobileCall() {
        lock.lock();
        try {
            System.out.println("mobile call starts");
            Thread.sleep(3000);
            System.out.println("mobile call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    static void skypeCall() {
        lock.lock();
        try {
            System.out.println("skype call starts");
            Thread.sleep(5000);
            System.out.println("skype call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    static void whatsappCall() {
        lock.lock();
        try {
            System.out.println("whatsapp call starts");
            Thread.sleep(2000);
            System.out.println("whatsapp call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}