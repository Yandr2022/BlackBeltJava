package Part7_Multithreading.lesson13_ThreadInterruption;

public class Demo {

    public static void main(String[] args) {
        System.out.println("main thread starts");
        InterruptedThread thread = new InterruptedThread();

        thread.start();
        try {
            Thread.sleep(2000);
            thread.interrupt();
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main thread ends");

    }
}

class InterruptedThread extends Thread {

    private double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 0; i <= 1_000_000_000; i++) {
           if (isInterrupted()){
               System.out.println("They want to interrupt the work of the thread, checking the status of objects ... ");
               System.out.println("The thread is interrupted");
               System.out.println(sqrtSum);
               return;
           }else {
               sqrtSum += Math.sqrt(i);
               try {
                   sleep(100);
               } catch (InterruptedException e) {
                   System.out.println("They want to interrupt the work of the thread of the thread during its sleep");
                   System.out.println(sqrtSum);
                   return;
               }
           }
        }
        System.out.println(sqrtSum);
    }
}