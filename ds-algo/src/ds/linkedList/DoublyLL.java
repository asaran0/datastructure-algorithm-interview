package ds.linkedList;

public class DoublyLL {
    DNode head;
    public static class DNode {
        int data;
        DNode pre, next;
        DNode(int data) {
            this.data = data;
            pre = next = null;
        }
    }
    public static DoublyLL getLinkedList() {
        DoublyLL dll = new DoublyLL();
        dll.pushNode(1);
        dll.pushNode(2);
        dll.pushNode(3);
        dll.pushNode(4);
        return dll;
    }

    private void pushNode(int i) {
        DNode node = new DNode(i);
        if (head == null) {
            head = node;
            return;
        }
        DNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = node;
        node.next = null;
        node.pre = temp;
    }

    public void print(DNode head) {
        if (head == null) return;
        DNode temp = head;
        DNode pre = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            pre = temp;
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("reverse traversal.");
        temp = pre;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.pre;
        }
        System.out.println("null");
    }

    public static void main(String arv[]) {
        DoublyLL dll = getLinkedList();
        dll.print(dll.head);
    }
}
