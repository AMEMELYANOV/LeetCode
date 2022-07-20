package hackerrank.easy.java;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    private static Scanner in = new Scanner(System.in);
    private static int b = in.nextInt();
    private static int h = in.nextInt();

    static {
        if (b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(b * h);
        }

    }

    public static void main(String[] args) {
    }
}
