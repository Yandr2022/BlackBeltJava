package Part7_Multithreading.lesson15_ThreadPool_SheduledExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo {


        public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);

//            for (int i = 0; i < 10; i++) {
//                service.execute(new RunImpl100());
//            }
//            service.shutdown();
//            try {
//                service.awaitTermination(6, TimeUnit.SECONDS);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            service.schedule(new RunImpl100(),3,TimeUnit.SECONDS);
//            service.scheduleAtFixedRate(new RunImpl100(),3,1,TimeUnit.SECONDS);
            service.scheduleWithFixedDelay(new RunImpl100(),3,1,TimeUnit.SECONDS);
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            service.shutdown();

            System.out.println("Main ends");

        }
    }

    class RunImpl100 implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " begins work");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " ends work");

        }
    }