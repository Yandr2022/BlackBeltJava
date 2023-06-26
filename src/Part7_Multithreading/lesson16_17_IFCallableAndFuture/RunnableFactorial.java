package Part7_Multithreading.lesson16_17_IFCallableAndFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {

    static int factorial;

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Factorial factorial1 = new Factorial(5);
        service.execute(factorial1);
        service.shutdown();
        try {
            service.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        System.out.println(factorial);

    }
}

class Factorial implements Runnable{
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f<0){
            return;
        }
        int result = 1;
        for (int i = 1; i <=f ; i++) {
            result*=i;
        }
        RunnableFactorial.factorial = result;

    }
}