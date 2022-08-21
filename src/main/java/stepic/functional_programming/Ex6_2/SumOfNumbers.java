package stepic.functional_programming.Ex6_2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

class SumOfNumbers {

    public static long sum(long[] numbers) {
        // write your code here
        return LongStream.of(numbers).sum();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToLong(Long::parseLong)
                .toArray();

        System.out.println(sum(numbers));
    }
}
