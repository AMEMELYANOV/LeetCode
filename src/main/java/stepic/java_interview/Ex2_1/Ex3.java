package stepic.java_interview.Ex2_1;

/***
 * Числа Фибоначчи
 *  Это числовой ряд, который выглядит следующим образом:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 * A0 = 0
 * A1 = 1
 * An+1 = An + An-1
 * Для чисел Фибоначчи справедлива следующая приблизительная формула:
 * An+1 = k * An,
 * где 1.61 < k < 1.62,
 * Основываясь на приблизительном значении числа k,
 * определите максимальный номер числа Фибоначчи,
 * которое будет записано в long без переполнения.
 * Ответ необходимо получить аналитически.
 * Обратите внимание, что приблизительная формула не учитывает первые два значения, возможно, к рассчитанному ответу нужно прибавить два.
 */

/***
 * 2^63 = 1.62^n
 * e^(63*ln(2)) = e^(n*ln(1.62))
 * 63*ln(2) = n*ln(1.62)
 * n = 63 * ln(2) / ln(1.62) = 90.5
 * Округляем n в меньшую сторону до целого числа,
 * получаем 90
 * т.к. первые элементы ряда в формуле не учтены, прибавляем еще два, получаем 92
 */

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(f(92));
    }

    public static int f(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}
