package stepic.java_interview.Ex2_6.Ex1;

import java.util.Iterator;

public class Ex1 {

    public static void main(String[] args) {
        FibonacciIterable iterable = new FibonacciIterable();
        Iterator<Integer> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.hasNext());
            System.out.println(iterator.next());
        }
    }
}
