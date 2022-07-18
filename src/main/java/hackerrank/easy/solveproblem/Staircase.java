package hackerrank.easy.solveproblem;

public class Staircase {
    public static void staircase(int n) {
        // Write your code here
        StringBuilder rsl = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n ; j++) {
                rsl.append(" ");
            }
            for (int j = 0; j < i; j++) {
                rsl.append("#");
            }
            rsl.append(System.lineSeparator());
        }
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        staircase(4);
    }
}
