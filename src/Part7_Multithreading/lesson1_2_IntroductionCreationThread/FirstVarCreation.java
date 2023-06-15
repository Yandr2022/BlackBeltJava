package Part7_Multithreading.lesson1_2_IntroductionCreationThread;

public class FirstVarCreation {
    public static void main(String[] args) {
//        System.out.println("start");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        System.out.println("end");
        System.out.println("Main start");

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread1.start();
        myThread2.start();

        System.out.println("Main end");

    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread1 start");
        for (int i = 0; i < 100; i++) {
            System.out.println("thread1: " + i);
        }
        System.out.println("Thread1 end");
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread2 start");
        for (int i = 100; i > 0; i--) {
            System.out.println("thread2: " + i);
        }
        System.out.println("Thread2 end");
    }
}