package stepic.alg_and_struct.Ex1_2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenvsOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0, even = 0;

        List<Integer> integers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (Integer integer : integers) {
            if (integer % 2 == 0) even++;
            else odd ++;
        }
        System.out.println(even == odd ? "equal" : even > odd ? "even" : "odd");
    }
}
