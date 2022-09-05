package stepic.java_interview.Ex1_1;

import java.util.OptionalLong;
import java.util.stream.LongStream;

public class Ex_3 {

    public static void main(String[] args) {
        printFibonacci(0);
        printFibonacci(1);
        printFibonacci(2);
        printFibonacci(3);
        printFibonacci(4);
        printFibonacci(5);
        printFibonacci(6);
        printFibonacci(7);
    }

    static void printFibonacci(long n) {
        // enter your code
        long a0 = 0;
        long a1 = 1;
        long temp;
        for (int i = 0; i < n; i++) {
            temp = a0 + a1;
            a0 = a1;
            a1 = temp;
        }
        System.out.println(a0);
    }
}
