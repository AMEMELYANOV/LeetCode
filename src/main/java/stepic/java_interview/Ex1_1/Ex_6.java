package stepic.java_interview.Ex1_1;

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