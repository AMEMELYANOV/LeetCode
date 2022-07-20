package hackerrank.easy.java;

import java.io.IOException;
import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp = 0;
            for (int j = 0; j < n; j++) {
                temp += (int) (b * Math.pow(2, j));
                System.out.printf("%s ", a + temp);
            }
            System.out.println();
        }
    }
}
