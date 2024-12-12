package Day8;

class StackUsingLinkedList {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node top;

    public StackUsingLinkedList() {
        top = null;
    }

    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int val = top.val;
        top = top.next;
        return val;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.val;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
    }
}
