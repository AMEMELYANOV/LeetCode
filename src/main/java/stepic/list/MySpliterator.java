package stepic.list;

import java.util.*;

public class MySpliterator {

    public static void main(String[] args) {
        List<Double> lst = new ArrayList<>(Arrays.asList(4.0, 4.0, 4.0, 100.0, 100.0, 100.0));
        print(spliteratorWork(lst));
    }

    public static List<Double> spliteratorWork(List<Double> lst) {
        List<Double> sqrs = new ArrayList<>();
        lst.spliterator().forEachRemaining(d -> {
            if (d > 1) sqrs.add(Math.sqrt(d));
        });
        return sqrs;
    }

    public static void print(List<Double> list) {
        Spliterator<Double> spliterator = list.spliterator();
        spliterator.trySplit()
                .forEachRemaining(d -> {
                    if (d >= 2) System.out.println(d);
                });
        System.out.println();
        spliterator.forEachRemaining(d -> {
            if (d >= 10) System.out.println(d);
        });
    }
}
