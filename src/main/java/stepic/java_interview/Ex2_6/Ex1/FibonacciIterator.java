package stepic.java_interview.Ex2_6.Ex1;

import java.util.Iterator;

class FibonacciIterator implements Iterator<Integer> {
    int count = 0;
    int A0 = 0;
    int A1 = 1;
    int An = 0;

    @Override
    public boolean hasNext() {
        // enter your code
        return (long) A0 + A1 <= Integer.MAX_VALUE;
    }

    @Override
    public Integer next() {
        // enter your code
        if (count == 0) {
            count++;
            return A0;
        } else if (count == 1) {
            count++;
            return A1;
        }
        else {
            An = A0 + A1;
            A0 = A1;
            A1 = An;
            return An;
        }
    }

}
