package hackerrank.easy.java;

import java.util.Scanner;

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(s1.substring(start, end));
    }
}
