package stepic.java_interview.Ex1_1.Ex_9;

/***
 * Подсчет количества листьев в дереве
 * Необходимо реализовать функцию:
 * на вход функция получает root бинарного дерева;
 * внутри функции нужно вычислить общее количество листьев в дереве;
 * листом считается такой узел дерева, у которого и левое, и правое поддерево равны null;
 * функция должна вернуть количество листьев.
 * На вход теста передаются параметры, необходимые для генерации рандомизированного дерева.
 */

public class Ex9 {
    static int treeLeafCount(Node root) {
        // enter your code
        if(root==null) return 0;
        Node ln = root.getLeft();
        Node rn = root.getRight();
        return (ln==null && rn==null) ? 1 : treeLeafCount(ln)+treeLeafCount(rn);
    }
}

class Node {
    private Node left;
    private Node right;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}