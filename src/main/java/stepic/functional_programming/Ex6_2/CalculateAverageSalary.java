package stepic.functional_programming.Ex6_2;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class CalculateAverageSalary {

    private static double calcAverageSalary(Collection<Integer> salaries) {
        // write your code here
        return salaries.stream().mapToInt(i -> i).average().orElse(0.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> salaries = scanner.tokens()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(calcAverageSalary(salaries));

        System.out.println(calcAverageSalary(List.of()));
        System.out.println(calcAverageSalary(List.of(1, 3)));
        System.out.println(calcAverageSalary(List.of(0)));


    }
}
