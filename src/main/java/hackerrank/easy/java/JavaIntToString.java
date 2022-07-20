package hackerrank.easy.java;

import java.util.Scanner;

public class JavaIntToString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String s = n + "";
        System.out.println("Good job");
        System.out.println(s);
    }
}
