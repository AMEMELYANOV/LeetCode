package hackerrank.easy.java;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaDatatypes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            BigInteger d = in.nextBigInteger();

            if (d.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0
                    || d.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                System.out.printf("%d can't be fitted anywhere.%s", d, System.lineSeparator());
                continue;
            }
            System.out.printf("%d can be fitted in: %s", d, System.lineSeparator());
            if (d.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0
                    && d.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                System.out.println("* byte");
            }
            if (d.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0
                    && d.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                System.out.println("* short");
            }
            if (d.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0
                    && d.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                System.out.println("* int");
            }
            if (d.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0
                    && d.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                System.out.println("* long");
            }
        }
    }
}
