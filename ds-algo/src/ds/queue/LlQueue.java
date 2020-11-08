package ds.queue;

public class LlQueue<T> {
    protected QNode front;
    protected QNode rare;
    public static class QNode<T> {
        T data;
        QNode next;
        QNode pre;
        QNode(T data) {
            this.data = data;
            next = pre = null;
        }
    }
    public void enque(int data) {
        QNode node = new QNode(data);
        node.next = front;
        if (front == null) {
            front = rare = node;
        } else {
            front.pre = node;
            front = node;
        }
    }

    public T deque() {
        if (rare == null) {
            System.out.println("Stack is empty.");
            assert false;
            return null;
        }
        T data = (T) rare.data;
        if (rare == front) front = rare = null;
        else {
            rare.pre.next = null;
            rare = rare.pre;
        }
        return data;
    }

    public T top() {
        if (front == null) {
            System.out.println("Stack is empty.");
            assert false;
        }
        return (T)front.data;
    }
    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }
    
    public void print() {
        QNode node = front;
        QNode pre = rare;
        while (node != null) {
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("null");
        while (pre != null) {
            System.out.print(pre.data+" -> ");
            pre = pre.pre;
        }
        System.out.println("null");
    }

    public static void main(String argv[]) {
        LlQueue<Integer> queue = new LlQueue<Integer>();
        queue.enque(1);
        queue.enque(2);
        queue.enque(3);
        queue.enque(4);
        queue.print();
        System.out.println(queue.top());
        System.out.println(queue.deque());
        queue.print();
        System.out.println(queue.isEmpty());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.isEmpty());
        System.out.println(queue.deque());
    }
}
