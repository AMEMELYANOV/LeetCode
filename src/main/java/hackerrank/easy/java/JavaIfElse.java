package hackerrank.easy.java;

import java.util.Scanner;

public class JavaIfElse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n > 1 && n < 6) {
            System.out.println("Not Weird");
        } else if (n > 5 && n < 21) {
            System.out.println("Weird");
        } else if (n > 20){
            System.out.println("Not Weird");
        }
    }
}
