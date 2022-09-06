package yandex;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int count = 0;

        while (count < i) {
            i -= ++count;
        }
        System.out.println(count);
    }
}
