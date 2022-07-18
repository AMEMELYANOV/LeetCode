package hackerrank.easy.solveproblem;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int rsl1 = 0, rsl2 = 0;
        for (int i = 0, j = 0; i < arr.size(); i++, j++) {
            rsl1 += arr.get(i).get(j);
        }
        for (int i = 0, j = arr.size() - 1; i < arr.size(); i++, j--) {
            rsl2 += arr.get(i).get(j);
        }
        return Math.abs(rsl1 - rsl2);
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6), Arrays.asList(9, 8, 9));
        System.out.println(diagonalDifference(arr));
    }
}

