package Day7;

class CircularQueue {
    private int[] arr;
    private int front, rear, size;

    public CircularQueue(int capacity) {
        arr = new int[capacity];
        front = rear = -1;
        size = capacity;
    }

    public boolean enqueue(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
            return false;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = value;
        return true;
    }

    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = arr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return value;
    }

    public int peek() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Dequeued: " + queue.dequeue());
        queue.enqueue(40);
        System.out.println("Peek: " + queue.peek());
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println("Dequeued: " + queue.dequeue());
    }
}
