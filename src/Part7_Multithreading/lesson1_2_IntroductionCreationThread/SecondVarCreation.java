package Part7_Multithreading.lesson1_2_IntroductionCreationThread;

public class SecondVarCreation implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread1 start");
        for (int i = 0; i < 10; i++) {
            System.out.println("thread1");
        }
        System.out.println("Thread1 end");
    }


    public static void main(String[] args) {

        System.out.println("Main start");

        Thread myThread1 = new Thread(new SecondVarCreation());
        Thread myThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread2 start");
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread2");
                }
                System.out.println("Thread2 end");

            }
        });


        myThread1.start();
        myThread2.start();
        new Thread(() -> {
            System.out.println("Thread3 start");
            for (int i = 0; i < 10; i++) {
                System.out.println("thread3");
            }
            System.out.println("Thread3 end");
        }).start();

        System.out.println("Main end");

    }


}


