class LinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    Node head;

    // INSERT (at end)
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // TRAVERSE (print list)
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // COUNT nodes
    public int count() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // SEARCH element
    public boolean search(int key) {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // DELETE a node
    public void delete(int key) {
        if (head == null) return;

        // If head needs to be deleted
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // REVERSE the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    // MAIN METHOD FOR TESTING
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.print("List: ");
        list.traverse();

        System.out.println("Count: " + list.count());

        System.out.println("Search 20: " + list.search(20));
        System.out.println("Search 50: " + list.search(50));

        list.delete(20);
        System.out.print("After deleting 20: ");
        list.traverse();

        list.reverse();
        System.out.print("After reversing: ");
        list.traverse();
    }
}
