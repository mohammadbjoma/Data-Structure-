class ArrayOperations {
  constructor(size) {
    this.arr = new Array(size);
    this.size = 0;
  }

  // INSERT
  insert(value) {
    if (this.size === this.arr.length) {
      console.log("Array is full");
      return;
    }
    this.arr[this.size++] = value;
  }

  // DELETE
  delete(value) {
    let index = -1;

    for (let i = 0; i < this.size; i++) {
      if (this.arr[i] === value) {
        index = i;
        break;
      }
    }

    if (index === -1) {
      console.log("Element not found");
      return;
    }

    for (let i = index; i < this.size - 1; i++) {
      this.arr[i] = this.arr[i + 1];
    }

    this.size--;
  }

  // TRAVERSE
  traverse() {
    let result = "";
    for (let i = 0; i < this.size; i++) {
      result += this.arr[i] + " ";
    }
    console.log(result);
  }

  // SEARCH
  search(key) {
    for (let i = 0; i < this.size; i++) {
      if (this.arr[i] === key) return true;
    }
    return false;
  }

  // COUNT
  count() {
    return this.size;
  }
}
const arr = new ArrayOperations(5);

arr.insert(10);
arr.insert(20);
arr.insert(30);

arr.traverse();
console.log("Count:", arr.count());
console.log("Search 20:", arr.search(20));

arr.delete(20);
arr.traverse();
