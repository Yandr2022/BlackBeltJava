package Part7_Multithreading.lesson16_17_IFCallableAndFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableSum {
    private static long value = 100L;
    private static long sum = 0L;

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future<Long>> futures = new ArrayList<>();
        long valueDividedBy10 = value / 10;
        for (int i = 0; i < 10; i++) {
            long from = valueDividedBy10 * i + 1;
            long to = valueDividedBy10 * (i + 1);
            PartialSum task = new PartialSum(from, to);
            Future<Long> future = service.submit(task);
            futures.add(future);
        }

        for (Future<Long> res : futures) {
            try {
                sum += res.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                System.out.println(e.getCause());
            }
        }
        service.shutdown();
        System.out.println(sum);

    }
}

class PartialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() {

        for (long i = 1; i <= to; i++) {
            localSum += i;
        }
        System.out.println("sum from " + from + " to " + to + ": " + localSum);
        return localSum;

    }
}
