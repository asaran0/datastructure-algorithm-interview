package ds.bst;


public class BasicBst {
    public static void minimumInBst(Node root) {
        System.out.println();
        Node node = getMinRec(root);
        if (node == null) System.out.println("Empty binary search tree.");
        else System.out.println("The minimum node = "+node.data);
    }

    private static Node getMinRec(Node root) {
        if (root == null) return null;
        if (root.left == null) return root;
        return getMinRec(root.left);
    }

    public static void main(String [] argv) {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(4);
        bst.insert(6);
        bst.insert(2);
        bst.insert(8);
        bst.printBinaryTree(bst.root);
        minimumInBst(bst.root);
    }
}
