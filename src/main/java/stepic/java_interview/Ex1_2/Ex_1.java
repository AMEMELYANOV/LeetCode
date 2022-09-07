package stepic.java_interview.Ex1_2;

/***
 * Подсчет объектов
 * Написать функцию, которая:
 * на вход принимает массив произвольных объектов;
 * считает количество объектов Apple;
 * считает количество объектов Banana;
 * выводит в консоль количество бананов и яблок в формате: banana=N, apple=M.
 * Для определения типа объекта использовать оператор instanceof.
 */

public class Ex_1 {

    void checkFruitCount(Object[] objects) {
        // enter your code
        int bananaNumber = 0;
        int appleNumber = 0;

        for (Object object : objects) {
            if (object instanceof Banana) bananaNumber++;
            if (object instanceof Apple) appleNumber++;
        }

        System.out.printf("banana=%d, apple=%d", bananaNumber, appleNumber);
    }

    public static void main(String[] args) {

    }
}

interface Apple {

}

interface Banana {

}
