package stepic.java_interview.Ex3_4.Ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class Ex2 {

    static volatile int count = 0;
    static private AtomicBoolean atomicBoolean = new AtomicBoolean(false);

    static void safeIncrement() {
        // enter your code
        while (true) {
            if (atomicBoolean.compareAndSet(false, true)) {
                count++;
                atomicBoolean.set(false);
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int n = 5;
        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                safeIncrement();
            }
        };
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < n; i++) {
            executor.execute(task);
        }
        executor.shutdown();
        executor.awaitTermination(Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        System.out.println(count);
    }
}
