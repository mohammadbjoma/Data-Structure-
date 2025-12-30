class LinkedList {

  // Node class
  static Node = class {
    constructor(data) {
      this.data = data;
      this.next = null;
    }
  };

  constructor() {
    this.head = null;
  }

  // INSERT (at end)
  insert(data) {
    const newNode = new LinkedList.Node(data);

    if (this.head === null) {
      this.head = newNode;
      return;
    }

    let current = this.head;
    while (current.next !== null) {
      current = current.next;
    }
    current.next = newNode;
  }

  // TRAVERSE (print list)
  traverse() {
    let current = this.head;
    let result = "";

    while (current !== null) {
      result += current.data + " -> ";
      current = current.next;
    }

    console.log(result + "null");
  }

  // COUNT nodes
  count() {
    let count = 0;
    let current = this.head;

    while (current !== null) {
      count++;
      current = current.next;
    }

    return count;
  }

  // SEARCH element
  search(key) {
    let current = this.head;

    while (current !== null) {
      if (current.data === key) return true;
      current = current.next;
    }

    return false;
  }

  // DELETE a node
  delete(key) {
    if (this.head === null) return;

    // If head needs to be deleted
    if (this.head.data === key) {
      this.head = this.head.next;
      return;
    }

    let current = this.head;
    while (current.next !== null && current.next.data !== key) {
      current = current.next;
    }

    if (current.next !== null) {
      current.next = current.next.next;
    }
  }

  // REVERSE the linked list
  reverse() {
    let prev = null;
    let current = this.head;

    while (current !== null) {
      let next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    this.head = prev;
  }
}
const list = new LinkedList();

list.insert(10);
list.insert(20);
list.insert(30);
list.insert(40);

console.log("List:");
list.traverse();

console.log("Count:", list.count());

console.log("Search 20:", list.search(20));
console.log("Search 50:", list.search(50));

list.delete(20);
console.log("After deleting 20:");
list.traverse();

list.reverse();
console.log("After reversing:");
list.traverse();
