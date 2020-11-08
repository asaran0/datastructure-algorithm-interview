package ds.linkedList;

public class LinkedList {
    protected LNode head;

    public static class LNode {
        public int data;
        public LNode next;

        public LNode(int data) {
            this.data = data;
            next = null;
        }
    }

    public void print(LNode head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public void print() {
        print(head);
    }

    public void insertAtEnd(int data) {
        LNode temp = head;
        LNode lNode = new LNode(data);
        if (head == null) head = lNode;
        else {
            while (temp.next != null) temp = temp.next;
            temp.next = lNode;
        }
    }

    public void insertAtStart(int data) {
        LNode lNode = new LNode(data);
        lNode.next = head;
        head = lNode;
    }

    /*
    * Write a function to delete a Linked List
    * https://www.geeksforgeeks.org/write-a-function-to-delete-a-linked-list/
    * */
    public void deleteLl() {
        head = null;
    }

    /*
     * https://www.geeksforgeeks.org/linked-list-set-3-deleting-node/
     *  Given a ‘key’, delete the first occurrence of this key in the linked list.
     */
    public void deleteNode(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            System.out.println("Node with data " + data + " deleted.");
        } else {
            LNode temp = head;
            while (temp.next != null) {
                if (temp.next.data == data) {
                    temp.next = temp.next.next;
                    System.out.println("Node with data " + data + " deleted.");
                    break;
                }
                temp = temp.next;
            }
        }
    }

    /*Delete all occurrence of key from linked list.*/
    public void deleteAllNodeWithData(int data) {
        if (head == null) return;
        while (head.data == data) {
            head = head.next;
            System.out.println("Node with data " + data + " deleted.");
        }
        LNode temp = head;
        while (temp.next != null) {
            if (temp.next.data == data) {
                temp.next = temp.next.next;
                System.out.println("Node with data " + data + " deleted.");
            } else
                temp = temp.next;
        }
    }

    /*
    * https://www.geeksforgeeks.org/find-length-of-a-linked-list-iterative-and-recursive/
    *Write a function to count the number of nodes in a given singly linked list.
    * */
    public int lengthOfLl(LNode node) {
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }
    /*
     * https://www.geeksforgeeks.org/find-length-of-a-linked-list-iterative-and-recursive/
     *Write a function to count the number of nodes in a given singly linked list.
     */
    public int lengthOfLlRec(LNode node) {
        if (node == null) return 0;
        return lengthOfLl(node.next) +1;
    }

    public static void main(String[] argv) {
        LinkedList ll = new LinkedList();
//        ll.print();
        ll.insertAtEnd(1);
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtStart(1);
        ll.insertAtEnd(1);
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(1);
        ll.insertAtEnd(1);

//        ll.head = ll.head.next;
        ll.print();
        ll.deleteAllNodeWithData(2);
//        ll.deleteNode(2);
//        ll.deleteNode(2);
//        ll.deleteNode(3);
        ll.print();
    }

}
