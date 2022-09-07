package stepic.java_interview.Ex1_1;

/***
 * Палиндром
 * Палиндром - слово, которое одинаково читается в обоих направлениях.
 * Например:
 * 123454321
 * madam i’m Adam
 * Olson in Oslo
 * Необходимо реализовать функцию:
 * на вход функция получает строку;
 * нужно вывести в консоль слово yes, если строка является палиндромом;
 * нужно вывести в консоль слово no, если строка не является палиндромом;
 * при определении палиндрома игнорировать все пробелы, знаки препинания и апостроф.
 */

public class Ex_2 {

    public static void main(String[] args) {
        checkPalindrom("Madam i’m Adam");
        checkPalindrom("Olson in Oslo");
        checkPalindrom("lson in Oslo");
    }

    static void checkPalindrom(String s) {
        // enter your code
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String result = "yes";

        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
               result = "no";
               break;
            }
        }
        System.out.println(result);
    }
}
