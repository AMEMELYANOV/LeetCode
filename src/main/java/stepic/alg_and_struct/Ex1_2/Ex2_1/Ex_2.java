package stepic.alg_and_struct.Ex1_2.Ex2_1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//
//        int count = 0;
//        int i = 1;
//
//        while (i * i < n + 1) {
//            if (n % i == 0) {
//                count++;
//            }
//            i++;
//        }
//        System.out.println(count);

        long count = IntStream.rangeClosed(1, n)
                .takeWhile(i -> i * i < n + 1)
                .filter(i -> n % i == 0)
                .count();
        System.out.println(count);
    }
}
