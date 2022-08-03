package stepic.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ListIteratorSet {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = Arrays.stream(reader.readLine().split("\\s")).collect(Collectors.toList());
        //enter your code here
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            String previous = listIterator.previous();
            if (!previous.startsWith("J")) {
                listIterator.remove();
            } else {
                previous = previous.substring(1);
                listIterator.set(previous);
                System.out.println(previous);
            }
        }
    }
}
