package hackerrank.easy.java;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s1 = in.nextLine().split(" ");
        String[] s2 = in.nextLine().split(" ");
        String[] s3 = in.nextLine().split(" ");
        System.out.println("================================");
        System.out.printf("%-15s%03d%s", s1[0], Integer.parseInt(s1[1]), System.lineSeparator());
        System.out.printf("%-15s%03d%s", s2[0], Integer.parseInt(s2[1]), System.lineSeparator());
        System.out.printf("%-15s%03d%s", s3[0], Integer.parseInt(s3[1]), System.lineSeparator());
        System.out.print("================================");
    }
}
