package stepic.java_interview.Ex2_4.Ex4;

import java.util.Iterator;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {

    }

    static void genConcurrentModificationException(List<Integer> integers) {
        // enter your code
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
