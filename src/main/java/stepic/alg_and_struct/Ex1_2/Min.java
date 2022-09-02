package stepic.alg_and_struct.Ex1_2;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 30001;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp % 10 == 3) {
                result = Math.min(result, temp);
            }
        }
        System.out.println(result);
    }
}
