package Part7_Multithreading.lesson6_KWVolatile;

public class Demo extends Thread {

    volatile boolean  flag = true;

    @Override
    public void run() {
        long counter = 0;
        while (flag) {
            counter++;
        }
        System.out.println("loop is finished. Counter = " + counter);
    }

    public static void main(String[] args) {
        Demo thread = new Demo();
        thread.start();
        try {
            Thread.sleep(3000);
            System.out.println("main thread wake up after 3 sec");
            thread.flag = false;
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end of program");
    }
}
