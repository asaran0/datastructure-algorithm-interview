package ds.linkedList;

import javafx.util.Pair;

public class LinkedListQuestions extends LinkedList {
    public static void main(String argv[]) {
        LinkedListQuestions ll = getDummyLinkedList();

        ll.print();
        System.out.println(ll.lengthOfLl(ll.head));
        System.out.println(ll.lengthOfLlRec(ll.head));

//        ll.deleteKeyAtPosition(2);
//        ll.deleteKeyAtPosition(0);
//        ll.deleteKeyAtPosition(2);
//        ll.print();
    }

    private static LinkedListQuestions getDummyLinkedList() {
        LinkedListQuestions ll = new LinkedListQuestions();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        return ll;
    }
    /*
    Given a singly linked list and a position, delete a linked list node at the given position.
    https://www.geeksforgeeks.org/delete-a-linked-list-node-at-a-given-position/
    */
    public void deleteKeyAtPosition(int position) {
        if (head == null) return;
        if (position == 0) {
            System.out.println("Node "+head.data +" deleted.");
            head = head.next;
            return;
        }
        LNode temp = head;
        while (temp.next != null && position > 1) {
            position--;
            temp = temp.next;
        }
        if (temp.next != null && position == 1) {
            System.out.println("Node "+temp.next.data +" deleted.");
            temp.next = temp.next.next;
        }
    }
    /*
     * https://www.geeksforgeeks.org/search-an-element-in-a-linked-list-iterative-and-recursive/
     * Write a function that searches a given key ‘x’ in a given singly linked list. The function should return true if x
     * is present in linked list and false otherwise.
     * */
    public int searchKey(LNode root, int key) {
        int index = 0;

        while (root != null) {
            if (root.data == key) return index;
            root = root.next;
            index++;
        }
        return -1;
    }

    /*
    * https://www.geeksforgeeks.org/search-an-element-in-a-linked-list-iterative-and-recursive/
    * Write a function that searches a given key ‘x’ in a given singly linked list. The function should return true if x
    * is present in linked list and false otherwise.
    * */
    public boolean searchKeyRec(LNode root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        return searchKeyRec(root.next, key);
    }
    /*
     * https://www.geeksforgeeks.org/write-a-function-to-get-nth-node-in-a-linked-list/
     * */
    public int getNth(LNode node, int n) {
        int index = 1;
        while (index < n && node != null) {
            node = node.next;
            index++;
        }
        if (index == n && node != null) return node.data;
        assert false;
        return Integer.MIN_VALUE;
    }
/*
* https://www.geeksforgeeks.org/write-a-function-to-get-nth-node-in-a-linked-list/
* */
    public int getNthRec(LNode node, int n) {
        if (node == null) {
            assert false;
            return Integer.MIN_VALUE;
        }
        if (n == 1) return node.data;
        return getNthRec(node.next, n-1);
    }
}
