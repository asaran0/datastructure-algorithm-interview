package ds.bst;

public class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    protected void printBinaryTree(Node node) {
        inOrderRec(node);
    }

    public void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.println(node.data);
            inOrderRec(node.right);
        }
    }

    public void preOrderRec(Node node) {
        if (node != null) {
            System.out.println(node.data);
            preOrderRec(node.left);
            preOrderRec(node.right);
        }
    }

    public void postOrderRec(Node node) {
        if (node != null) {
            postOrderRec(node.left);
            postOrderRec(node.right);
            System.out.println(node.data);
        }
    }
}
