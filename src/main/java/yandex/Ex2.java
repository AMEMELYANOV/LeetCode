package yandex;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();
        String s1 = "/home/";
        String s2 = "/../";
        String s3 = "/home//foo/";

        System.out.println(getCanonicalPath(s1));
        System.out.println(getCanonicalPath(s2));
        System.out.println(getCanonicalPath(s3));
    }

    private static String getCanonicalPath(String s) {
        s = "/" + s;
        s = s.replaceAll("//", "/");
        if (s.length() > 1 && s.charAt(s.length() - 1) == '/') {
            s = s.substring(0, s.length() - 1);
        }

        return s;
    }
}
