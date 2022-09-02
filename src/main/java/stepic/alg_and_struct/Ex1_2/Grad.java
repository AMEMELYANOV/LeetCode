package stepic.alg_and_struct.Ex1_2;

import java.util.Scanner;

public class Grad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());

        if (x < -25) {
            System.out.println("жутко холодно");
        } else if (x < 0) {
            System.out.println("холодно");
        } else if (x < 10) {
            System.out.println("прохладно");
        } else if (x < 25) {
            System.out.println("тепло");
        } else {
            System.out.println("жара");
        }
    }
}