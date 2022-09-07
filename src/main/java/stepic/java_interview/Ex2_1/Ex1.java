package stepic.java_interview.Ex2_1;

/***
 *Реверс чисел
 * Необходимо реализовать функцию:
 * на вход функция получает целое число;
 * внутри функции нужно реализовать реверс цифр в числе для десятичной системы счисления;
 * функция должна вернуть новое число.
 */

public class Ex1 {

    static int reverse(int n) {
        int result = 0;
        while (n > 0) {
            result *= 10;
            result += n % 10;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(0));
        System.out.println(reverse(1));
        System.out.println(reverse(12345));
    }

}
