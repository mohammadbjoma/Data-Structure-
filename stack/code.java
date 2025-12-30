package stack;

class Stack {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    // PUSH
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // POP
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }

    // PEEK
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // TRAVERSE
    public void traverse() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // COUNT
    public int count() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // SEARCH
    public boolean search(int key) {
        Node current = top;
        while (current != null) {
            if (current.data == key) return true;
            current = current.next;
        }
        return false;
    }

    // TEST
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.traverse();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        stack.traverse();
        System.out.println("Count: " + stack.count());
        System.out.println("Search 20: " + stack.search(20));
    }
}
const stack = new Stack();

stack.push(10);
stack.push(20);
stack.push(30);

stack.traverse();
console.log("Peek:", stack.peek());
console.log("Pop:", stack.pop());
stack.traverse();
console.log("Count:", stack.count());
console.log("Search 20:", stack.search(20));
