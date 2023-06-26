package Part7_Multithreading.lesson12_DaemonThreads;

public class Demo {
    public static void main(String[] args) {
        System.out.println("main thread starts");
        UserThread thread = new UserThread("user thread");
        DaemonThread threadD = new DaemonThread("daemon thread");

        thread.start();
        threadD.setDaemon(true);
        threadD.start();

//        try {
//            thread.join();
//            threadD.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("main thread ends");
    }
}

class UserThread extends Thread{

    public UserThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (char i = 'A'; i <= 'J' ; i++) {
            try {
                sleep(300);
                System.out.print(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class DaemonThread extends Thread{

    public DaemonThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (int i = 1; i <= 1000 ; i++) {
            try {
                sleep(300);
                System.out.print(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}