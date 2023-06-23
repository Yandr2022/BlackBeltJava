package Part7_Multithreading.lesson11_IFLock_ClassReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo {

    public static void main(String[] args) {

    }
}

class Call{

    private Lock lock = new ReentrantLock();
}