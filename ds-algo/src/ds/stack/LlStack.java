package ds.stack;

import ds.linkedList.LinkedList;

public class LlStack extends LinkedList {

    public void push(int data) {
        LNode lNode = new LNode(data);
        lNode.next = head;
        head = lNode;
    }

    public int pop() {
        if (head == null) {
            System.out.println("Stack is empty.");
            return Integer.MIN_VALUE;
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    public int top() {
        if (head == null) {
            System.out.println("Stack is empty.");
            assert false;
        }
        return head.data;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return false;
    }

    public static void main(String argv[]) {
        LlStack stack = new LlStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.print();
        System.out.println(stack.top());
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
    }
}
