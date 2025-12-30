class Queue {

  // Node class
  static Node = class {
    constructor(data) {
      this.data = data;
      this.next = null;
    }
  };

  constructor() {
    this.front = null;
    this.rear = null;
  }

  // ENQUEUE
  enqueue(data) {
    const newNode = new Queue.Node(data);

    if (this.rear === null) {
      this.front = this.rear = newNode;
      return;
    }

    this.rear.next = newNode;
    this.rear = newNode;
  }

  // DEQUEUE
  dequeue() {
    if (this.front === null) {
      console.log("Queue is empty");
      return -1;
    }

    const value = this.front.data;
    this.front = this.front.next;

    if (this.front === null) {
      this.rear = null;
    }

    return value;
  }

  // PEEK
  peek() {
    if (this.front === null) {
      console.log("Queue is empty");
      return -1;
    }
    return this.front.data;
  }

  // TRAVERSE
  traverse() {
    let current = this.front;
    let result = "";

    while (current !== null) {
      result += current.data + " -> ";
      current = current.next;
    }

    console.log(result + "null");
  }

  // COUNT
  count() {
    let count = 0;
    let current = this.front;

    while (current !== null) {
      count++;
      current = current.next;
    }

    return count;
  }

  // SEARCH
  search(key) {
    let current = this.front;

    while (current !== null) {
      if (current.data === key) return true;
      current = current.next;
    }

    return false;
  }
}
const queue = new Queue();

queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);

queue.traverse();
console.log("Peek:", queue.peek());
console.log("Dequeue:", queue.dequeue());
queue.traverse();
console.log("Count:", queue.count());
console.log("Search 20:", queue.search(20));
