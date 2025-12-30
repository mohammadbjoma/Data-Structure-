class BST {
  constructor() {
    this.root = null;
  }

  class Node {
    constructor(data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  Node(data) {
    return { data: data, left: null, right: null };
  }

  // INSERT
  insert(root, data) {
    if (!root) return this.Node(data);

    if (data < root.data) root.left = this.insert(root.left, data);
    else if (data > root.data) root.right = this.insert(root.right, data);

    return root;
  }

  // INORDER TRAVERSAL
  inorder(root) {
    if (root) {
      this.inorder(root.left);
      process.stdout.write(root.data + " ");
      this.inorder(root.right);
    }
  }

  // SEARCH
  search(root, key) {
    if (!root) return false;
    if (root.data === key) return true;
    if (key < root.data) return this.search(root.left, key);
    else return this.search(root.right, key);
  }

  // MIN VALUE NODE
  minValueNode(node) {
    let current = node;
    while (current.left) current = current.left;
    return current;
  }

  // DELETE
  delete(root, key) {
    if (!root) return null;

    if (key < root.data) root.left = this.delete(root.left, key);
    else if (key > root.data) root.right = this.delete(root.right, key);
    else {
      if (!root.left) return root.right;
      else if (!root.right) return root.left;

      let temp = this.minValueNode(root.right);
      root.data = temp.data;
      root.right = this.delete(root.right, temp.data);
    }

    return root;
  }

  // COUNT
  count(root) {
    if (!root) return 0;
    return 1 + this.count(root.left) + this.count(root.right);
  }
}

// TEST
const tree = new BST();
tree.root = tree.insert(tree.root, 50);
tree.root = tree.insert(tree.root, 30);
tree.root = tree.insert(tree.root, 70);
tree.root = tree.insert(tree.root, 20);
tree.root = tree.insert(tree.root, 40);
tree.root = tree.insert(tree.root, 60);
tree.root = tree.insert(tree.root, 80);

process.stdout.write("Inorder: ");
tree.inorder(tree.root);
console.log();

console.log("Search 40:", tree.search(tree.root, 40));
console.log("Count:", tree.count(tree.root));

tree.root = tree.delete(tree.root, 70);
process.stdout.write("After deleting 70: ");
tree.inorder(tree.root);
console.log();
