package hackerrank.easy.java;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 1;
        StringBuilder builder = new StringBuilder();

        while (in.hasNext()) {
            builder.append(i).append(" ").append(in.nextLine()).append(System.lineSeparator());
            i++;
        }
        System.out.print(builder);
    }
}
