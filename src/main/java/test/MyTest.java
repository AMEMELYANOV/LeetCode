package test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MyTest implements MyInterface1, MyInterface2{


    public static void main(String[] args) {
//        MyTest myTest = new MyTest();
//        myTest.start();
        String s = "fff";
        s.concat("dfjd");
        System.out.println(s);


//        Runnable hellos = () -> {
//            for (int i = 0; i < 1000; i++) {
//                System.out.println("Hello " + i);
//            }
//        };
//        Runnable goodbye = () -> {
//            for (int i = 0; i < 1000; i++) {
//                System.out.println("Goodbye " + i);
//            }
//        };
//
//        Executor executor = Executors.newCachedThreadPool();
//        executor.execute(hellos);
//        executor.execute(goodbye);
    }
}
