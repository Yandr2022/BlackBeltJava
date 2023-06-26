package Part7_Multithreading.lesson16_17_IFCallableAndFuture;

import java.util.concurrent.*;

public class CallableFactorial {


    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        FactorialCall factorial = new FactorialCall(7);
        Future<Integer> future = service.submit(factorial);
        try {
            System.out.println(future.isDone());
            System.out.println("try get result");
            System.out.println("result was get: " + future.get());
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            service.shutdown();
        }

    }
}

class FactorialCall implements Callable<Integer> {
    int f;

    public FactorialCall(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws WrongNumberException {
        if (f < 0) {
            throw new WrongNumberException();
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result;

    }
}

class WrongNumberException extends Exception {
    @Override
    public String toString() {
        return "Wrong Number";
    }
}