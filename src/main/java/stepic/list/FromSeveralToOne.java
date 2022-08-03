package stepic.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FromSeveralToOne {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sets = reader.readLine().split(";");

        Set<Integer> set1;
        //your code(add elements to set1 from sets[0])
        set1 = Arrays.stream(sets[0].split(" ")).map(Integer::parseInt).collect(Collectors.toSet());

        Set<Integer> set2;
        //your code(add elements to set2 from sets[1])
        set2 = Arrays.stream(sets[1].split(" ")).map(Integer::parseInt).collect(Collectors.toSet());

        Set<Integer> set3;
        //your code(add elements to set3 from sets[2])
        set3= Arrays.stream(sets[2].split(" ")).map(Integer::parseInt).collect(Collectors.toSet());

        Set<Integer> resultTreeSet = unionTreeLargeNumber(set1,set2,set3);

        //print elements of resultTreeSet(using System.out.printLn()) below
        resultTreeSet.forEach(System.out::println);

    }

    public static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1,Set<Integer> set2,Set<Integer> set3){
        TreeSet<Integer> resultSet = new TreeSet<>(Comparator.comparingInt(x -> (int) x).reversed());
        Stream.of(set1, set2, set3)
                .map(set -> set
                        .stream().max(Comparator.naturalOrder()).get())
                .forEach(resultSet::add);
        return resultSet;
    }
}
