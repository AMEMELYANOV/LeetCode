package stepic.java_interview.Ex2_6.Ex1;

import java.util.Iterator;

class FibonacciIterable implements Iterable<Integer> {
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }
}
