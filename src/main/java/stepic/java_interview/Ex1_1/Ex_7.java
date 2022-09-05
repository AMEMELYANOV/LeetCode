package stepic.java_interview.Ex1_1;

public class Ex_7 {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(1);
        Node node3 = new Node(3);
        Node node4 = new Node(7);
        Node node5 = new Node(8);
        Node node6 = new Node(2);
        Node node7 = new Node(4);
        Node node8 = new Node(5);
        Node node9 = new Node(6);
        Node node10 = new Node(6);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        node6.setNext(node7);
        node7.setNext(node8);
        node8.setNext(node9);
        node9.setNext(node10);

        printNode(node1);
        printNode(node6);
        System.out.println("======================");
        Node head = merge(node1, node6);
        printNode(head);
    }

    static Node merge(Node head1, Node head2) {
        if(head1 == null) {
            return head2;
        }
        if(head2 == null) {
            return head1;
        }
        Node node = new Node();
        if(head1.getData() < head2.getData()) {
            node.setData(head1.getData());
            node.setNext(merge(head1.getNext(), head2));
        } else {
            node.setData(head2.getData());
            node.setNext(merge(head1, head2.getNext()));
        }
        return node;
    }

    static void printNode(Node head) {
        while (head != null) {
            System.out.println(head.getData());
            head = head.getNext();
        }
    }
}

class Node {
    private int data;
    private Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

