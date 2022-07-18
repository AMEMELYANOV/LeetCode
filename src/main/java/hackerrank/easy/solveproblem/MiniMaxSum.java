package hackerrank.easy.solveproblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long out1 = arr.stream().mapToLong(value -> value).sum() - arr.get(arr.size() - 1);
        long out2 = arr.stream().mapToLong(value -> value).sum() - arr.get(0);
        System.out.printf("%d %d %s", out1, out2, System.lineSeparator());
    }

    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(9, 7, 5, 3, 1));
        miniMaxSum(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625));
        miniMaxSum(Arrays.asList(7, 69, 2, 221, 8974));
        miniMaxSum(Arrays.asList(9, 7, 5, 3, 1));
    }
}
