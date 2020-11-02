package ds.bst;

public class BST extends BinaryTree {
    BST() {
        super();
    }

    public void insert(int data) {
//        printBinaryTree(root);
        root = insertRecursive(root, data);
//        printBinaryTree(root);
    }


    public Node insertRecursive(Node node, int data) {
        if (node == null)
            return new Node(data);
        if (node.data > data) node.left = insertRecursive(node.left, data);
        else node.right = insertRecursive(node.right, data);
        return node;
    }

    public void search(int key) {
        Node node = searchRecursive(root, key);
        if (node == null) System.out.println("Key " + key + " not found.");
        else System.out.println("Key " + key + " found.");
    }

    private Node searchRecursive(Node node, int key) {
        if (node == null || node.data == key)
            return node;
        if (node.data > key)
            return searchRecursive(node.left, key);
        return searchRecursive(node.right, key);
    }

}
