package stepic.alg_and_struct.Ex1_2.Ex2_1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        TreeSet<Integer> set = Arrays.stream(s.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(Math.round((double) set.first() / (double) set.last() * 100));
    }
}
