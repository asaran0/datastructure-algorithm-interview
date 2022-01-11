package ds.linkedList;

public class CircularLL {
    CNode head;
    public static class CNode {
        int data;
        CNode next;
        CNode(int data) {
            this.data = data;
            next = null;
        }
    }

    public static CircularLL getLinkedList() {
        CircularLL cll = new CircularLL();
        cll.pushNode(1);
        cll.pushNode(2);
        cll.pushNode(3);
        cll.pushNode(4);
        return cll;
    }

    private void pushNode(int i) {
        CNode node = new CNode(i);
        if (head == null) {
            node.next = node;
            head = node;
            return;
        }
        CNode temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = node;
        node.next = head;
    }

    public void print(CNode head) {
        if (head == null) return;
        CNode temp = head;
        do {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head");
    }

    /*
    * https://www.geeksforgeeks.org/split-a-circular-linked-list-into-two-halves/
    * Split a Circular Linked List into two halves
    * */
//    public Pair<CNode, CNode> get2HalfCll() {
//        CNode first = head, second = null;
//        CNode fast, slow;
//        fast = slow = head;
//        while (fast != null) {
//            if (fast.next == null) break;
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        return new Pair<CNode, CNode>(first, second);
//    }

    public static void main(String arv[]) {
        CircularLL cll = getLinkedList();
        cll.print(cll.head);
    }
}
