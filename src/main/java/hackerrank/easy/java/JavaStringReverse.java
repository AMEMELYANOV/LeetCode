package hackerrank.easy.java;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        char[] oldChars = word.toCharArray();
        char[] newChars = new char[word.length()];
        int length = word.length();
        for (int i = 0, j = length - 1; i < length; i++, j--) {
            newChars[i] = oldChars[j];
        }
        String reversedWord = String.valueOf(newChars);
        System.out.println(word.equals(reversedWord) ? "Yes" : "No");
    }
}
