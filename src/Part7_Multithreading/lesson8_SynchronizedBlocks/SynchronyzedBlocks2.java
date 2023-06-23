package Part7_Multithreading.lesson8_SynchronizedBlocks;


public class SynchronyzedBlocks2 {

    static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println("mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("mobile call ends");
        }
    }

    void whatsappCall() {
        synchronized (lock) {
            System.out.println("whatsapp call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("whatsapp call ends");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("skype call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("skype call ends");
        }
    }


    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            new SynchronyzedBlocks2().mobileCall();
        });
        Thread thread1 = new Thread(() -> {
            new SynchronyzedBlocks2().whatsappCall();
        });
        Thread thread2 = new Thread(() -> {
            new SynchronyzedBlocks2().skypeCall();
        });

        thread.start();
        thread1.start();
        thread2.start();


    }
}


