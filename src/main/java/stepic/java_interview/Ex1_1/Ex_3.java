package stepic.java_interview.Ex1_1;

/***
 * Числа Фибоначчи
 *  Это числовой ряд, который выглядит следующим образом:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 * A0 = 0
 * A1 = 1
 * An+1 = An + An-1
 * Необходимо реализовать функцию:
 * на вход функция получает целое число n;
 * необходимо вывести в консоль значение числа Фибоначчи под номером n;
 * не рекомендуется использовать рекурсию.
 */

public class Ex_3 {

    public static void main(String[] args) {
        printFibonacci(0);
        printFibonacci(1);
        printFibonacci(2);
        printFibonacci(3);
        printFibonacci(4);
        printFibonacci(5);
        printFibonacci(6);
        printFibonacci(7);
    }

    static void printFibonacci(long n) {
        // enter your code
        long a0 = 0;
        long a1 = 1;
        long temp;
        for (int i = 0; i < n; i++) {
            temp = a0 + a1;
            a0 = a1;
            a1 = temp;
        }
        System.out.println(a0);
    }
}
