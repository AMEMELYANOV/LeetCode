package stepic.java_interview.Ex1_1;

import java.util.regex.Pattern;

public class Ex_2 {

    public static void main(String[] args) {
        checkPalindrom("Madam i’m Adam");
        checkPalindrom("Olson in Oslo");
        checkPalindrom("lson in Oslo");
    }

    static void checkPalindrom(String s) {
        // enter your code
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String result = "yes";

        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
               result = "no";
               break;
            }
        }
        System.out.println(result);
    }
}
