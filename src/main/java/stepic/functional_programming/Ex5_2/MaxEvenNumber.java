package stepic.functional_programming.Ex5_2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

class MaxEvenNumber {

    public static int findMaxEvenNumber(Collection<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(value -> value)
                .max().orElse(0); // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        System.out.println(findMaxEvenNumber(numbers));
    }
}
