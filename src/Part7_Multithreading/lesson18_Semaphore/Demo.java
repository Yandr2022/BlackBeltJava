package Part7_Multithreading.lesson18_Semaphore;

import java.util.concurrent.Semaphore;

public class Demo {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        Caller caller = new Caller("Yuli", callBox);
        Caller caller1 = new Caller("Natalie", callBox);
        Caller caller2 = new Caller("Ivan", callBox);
        Caller caller3 = new Caller("Alex", callBox);
        Caller caller4 = new Caller("Svetlana", callBox);

    }
}
class Caller extends Thread {
    private String name;
    private Semaphore callBox;

    public Caller(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " waiting");
            callBox.acquire();
            System.out.println(name + " using phone");
            sleep(2000);
            System.out.println(name + " finished use phone");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            callBox.release();
        }
    }
}