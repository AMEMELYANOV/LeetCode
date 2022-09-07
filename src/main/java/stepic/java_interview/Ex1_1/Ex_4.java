package stepic.java_interview.Ex1_1;

/***
 * Работа с числами
 * Необходимо реализовать функцию:
 * на вход функция получает целое число n;
 * значение числа n лежит в диапазоне (1000, 10000);
 * если значение сотни нечетное, умножить это число на два;
 * если значение сотни четное, добавить к этому числу 100;
 * полученное число вывести в консоль.
 */

public class Ex_4 {

    public static void main(String[] args) {
        calculateAndPrint(1111);
        calculateAndPrint(1211);
    }

    static void calculateAndPrint(int n) {
        // enter your code
        System.out.println(n % 1000 / 100 % 2 == 0 ? n + 100 : n * 2);
    }
}
