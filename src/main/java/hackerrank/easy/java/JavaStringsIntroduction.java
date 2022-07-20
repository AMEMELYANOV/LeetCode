package hackerrank.easy.java;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();

        System.out.println((s1 + s2).length());
        System.out.println(s1.compareTo(s2) > 0 ? "Yes" : "No");
        System.out.println(s1.substring(0, 1).toUpperCase() + s1.substring(1) + " "
                + s2.substring(0, 1).toUpperCase() + s2.substring(1));
    }
}
