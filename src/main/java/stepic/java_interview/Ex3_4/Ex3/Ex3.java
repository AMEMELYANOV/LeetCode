package stepic.java_interview.Ex3_4.Ex3;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Ex3 {
    static ReentrantLock lockA = new ReentrantLock();
    static ReentrantLock lockB = new ReentrantLock();

    static AtomicInteger count = new AtomicInteger(2);
    static CyclicBarrier barrier = new CyclicBarrier(2);

    static void method1() {
        lockA.lock();
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        lockB.lock();
        try {
            job1();
        } finally {
            lockB.unlock();
            lockA.unlock();
        }
    }

    static void method2() {
        lockB.lock();
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        lockA.lock();
        try {
            job2();
        } finally {
            lockA.unlock();
            lockB.unlock();
        }
    }

    static void job1() {
        System.out.println("job1");
    }

    static void job2() {
        System.out.println("job2");
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = () -> method1();
        Runnable runnable2 = () -> method2();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(runnable1);
        executor.execute(runnable2);
        executor.shutdown();
        count.incrementAndGet();
        executor.awaitTermination(Integer.MAX_VALUE, TimeUnit.MILLISECONDS);

    }
}
