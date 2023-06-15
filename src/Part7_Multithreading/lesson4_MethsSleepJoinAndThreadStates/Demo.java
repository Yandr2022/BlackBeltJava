package Part7_Multithreading.lesson4_MethsSleepJoinAndThreadStates;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread start");

        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " start");
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " end");
        });
        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " start");
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " end");
        });

        System.out.println(thread.getState());
        System.out.println(thread1.getState());

        thread.start();
        thread1.start();

        System.out.println(thread.getState());
        System.out.println(thread1.getState());

        thread.join();
        thread1.join();

        System.out.println(thread.getState());
        System.out.println(thread1.getState());

        System.out.println("Main thread end");

    }
}
