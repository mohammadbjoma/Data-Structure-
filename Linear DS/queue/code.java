package queue;

class Queue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front, rear;

    // ENQUEUE
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // DEQUEUE
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null)
            rear = null;

        return value;
    }

    // PEEK
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // TRAVERSE
    public void traverse() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // COUNT
    public int count() {
        int count = 0;
        Node current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // SEARCH
    public boolean search(int key) {
        Node current = front;
        while (current != null) {
            if (current.data == key) return true;
            current = current.next;
        }
        return false;
    }

    // TEST
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.traverse();
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        queue.traverse();
        System.out.println("Count: " + queue.count());
        System.out.println("Search 20: " + queue.search(20));
    }
}

