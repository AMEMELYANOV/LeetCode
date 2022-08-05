package stepic.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InnerJoinForArrays {

    public static void main(String[] args) {
        var right = List.of(1, 2, 3);
        var left = List.of(4, 5, 6);
//        System.out.println(extractDuplicates(right, left));

        right = List.of(1, 2, 3);
        left = List.of(1, 2, 3);
//        System.out.println(extractDuplicates(right, left));

        right = List.of(1, 2, 3);
        left = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(extractUnique(right, left));

        right = List.of(1, 2, 3);
        left = List.of(4, 5, 6);
        System.out.println(extractUnique(right, left));

        right = List.of(1, 2, 3);
        left = List.of(1, 2, 3);
        System.out.println(extractUnique(right, left));
    }

    public static List<Integer> extractDuplicates(List<Integer> left, List<Integer> right) {
        return left.stream().filter(right::contains).collect(Collectors.toList());
    }

    public static List<Integer> extractUnique(List<Integer> left, List<Integer> right) {
        List<Integer> duplicates = left.stream().filter(right::contains).collect(Collectors.toList());
        return Stream.concat(left.stream(), right.stream())
                .filter(i -> !duplicates.contains(i))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }
}
