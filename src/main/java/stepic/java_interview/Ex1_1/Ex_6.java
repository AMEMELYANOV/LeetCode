package stepic.java_interview.Ex1_1;

/***
 * Однонаправленный связанный список
 * Необходимо реализовать функцию reverse:
 * на вход функция получает head связанного списка;
 * внутри функции нужно перевернуть связанный список;
 * функция должна вернуть head нового связанного списка.
 */

public class Ex_6 {

    public static void main(String[] args) {

    }

    static Node reverse(Node head) {
        // enter your code
        Node next = head.getNext();
        Node current = head;
        Node previous = null;
        while (next != null) {
            current.setNext(previous);
            previous = current;
            current = next;
            next = next.getNext();
        }
        current.setNext(previous);
        return current;
    }
}