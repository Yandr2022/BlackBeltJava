package Part7_Multithreading.lesson11_IFLock_ClassReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {

    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();

        new Employee("Yuli", lock);
        new Employee("Ivan", lock);
        new Employee("Alex", lock);
        Thread.sleep(5000);
        new Employee("Natali", lock);
        new Employee("Igor", lock);

    }
}

class Employee extends Thread {
    private String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " waiting....");
//            lock.lock();
                System.out.println(name + " using ATM now");
                Thread.sleep(2000);
                System.out.println(name + " finished using ATM");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " doesn't want to wait");
        }
    }
}
