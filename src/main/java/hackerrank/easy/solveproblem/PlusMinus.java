package hackerrank.easy.solveproblem;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double positive = 1.0 * arr.stream().filter(x -> x > 0).count() / arr.size();
        double negative = 1.0 * arr.stream().filter(x -> x < 0).count() / arr.size();
        double zero = 1.0 * arr.stream().filter(x -> x == 0).count() / arr.size();
        System.out.format("%.6f%s%.6f%s%.6f%s", positive, System.lineSeparator(),
                negative, System.lineSeparator(),
                zero, System.lineSeparator());

    }

    public static void main(String[] args) {
        plusMinus(Arrays.asList(1, 1, 0, -1, -1));
    }
}
