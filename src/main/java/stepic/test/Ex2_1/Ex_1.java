package stepic.test.Ex2_1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = IntStream
                .rangeClosed(Math.min(1, n), Math.max(1, n))
                .sum();
        System.out.println(result);

    }
}
