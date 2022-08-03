package stepic.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyIterator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //lets go
        List<Integer> integers = Stream.of(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        Iterator<Integer> it = integers.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next % 2 == 0) {
                it.remove();
            }
        }
        integers.forEach(System.out::println);
    }
}
