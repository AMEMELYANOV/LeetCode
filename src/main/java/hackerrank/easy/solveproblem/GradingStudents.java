package hackerrank.easy.solveproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> rsl = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade < 38 || grade % 5 < 3) {
                rsl.add(grade);
            } else {
                rsl.add(grade + 5 - grade % 5);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(gradingStudents(Arrays.asList(73, 67, 38, 33)));
    }
}
