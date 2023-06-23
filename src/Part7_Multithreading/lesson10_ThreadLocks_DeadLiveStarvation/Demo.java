package Part7_Multithreading.lesson10_ThreadLocks_DeadLiveStarvation;

public class Demo {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
MyThread thread = new MyThread();
MyThread1 thread1 = new MyThread1();

thread.start();
thread1.start();

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ ": trying to capture the lock1 monitor...");
        synchronized (Demo.lock1){
            System.out.println(Thread.currentThread().getName()+ ":  the lock1 monitor captured successfully!!!");
            System.out.println(Thread.currentThread().getName()+ ": trying to capture the lock2 monitor...");
            synchronized (Demo.lock2){
                System.out.println(Thread.currentThread().getName()+ ":  the lock1 & lock2 monitors captured successfully!!!");
            }
        }
    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ ": trying to capture the lock1 monitor...");
        synchronized (Demo.lock2){
//        synchronized (Demo.lock1){
            System.out.println(Thread.currentThread().getName()+ ":  the lock1 monitor captured successfully!!!");
            System.out.println(Thread.currentThread().getName()+ ": trying to capture the lock2 monitor...");
            synchronized (Demo.lock1){
//            synchronized (Demo.lock2){
                System.out.println(Thread.currentThread().getName()+ ":  the lock1 & lock2 monitors captured successfully!!!");
            }
        }
    }
}