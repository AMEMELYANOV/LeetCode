package hackerrank.easy.java;

import java.util.Scanner;

public class JavaStdinAndStdoutII {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = Integer.parseInt(in.nextLine());
        double d = Double.parseDouble(in.nextLine());
        String s = in.nextLine();
        System.out.printf("String: %s%s", s, System.lineSeparator());
        System.out.printf("Double: %s%s", d, System.lineSeparator());
        System.out.printf("Int: %s", i);
    }
}
