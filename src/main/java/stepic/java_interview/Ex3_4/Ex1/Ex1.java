package stepic.java_interview.Ex3_4.Ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Ex1 {

    static volatile int count = 0;
    static ReentrantLock lock = new ReentrantLock();

    static void safeIncrement() {
        // enter your code
        lock.lock();
        try {
            count++;
            System.out.println(count);
        } finally {
            lock.unlock();
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
