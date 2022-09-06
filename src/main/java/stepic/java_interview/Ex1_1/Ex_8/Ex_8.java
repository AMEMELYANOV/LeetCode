package stepic.java_interview.Ex1_1.Ex_8;

public class Ex_8 {

    public static void main(String[] args) {

    }

    static  int treeDepth(Node root) {
        // enter your code
        if(root == null) return 0;
        return 1 + Math.max(treeDepth(root.getLeft()), treeDepth(root.getRight()));
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