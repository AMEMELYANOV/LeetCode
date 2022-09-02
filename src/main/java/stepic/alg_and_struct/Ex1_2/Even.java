package stepic.alg_and_struct.Ex1_2;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Optional<Integer> anInt = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .findFirst();
        System.out.println(anInt.get());
    }
}
