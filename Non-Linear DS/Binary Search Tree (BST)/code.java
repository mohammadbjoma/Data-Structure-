class BST {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    // INSERT
    public Node insert(Node root, int data) {
        if (root == null) return new Node(data);

        if (data < root.data) root.left = insert(root.left, data);
        else if (data > root.data) root.right = insert(root.right, data);

        return root;
    }

    // INORDER TRAVERSAL
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // SEARCH
    public boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data) return search(root.left, key);
        else return search(root.right, key);
    }

    // MIN VALUE NODE
    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) current = current.left;
        return current;
    }

    // DELETE
    public Node delete(Node root, int key) {
        if (root == null) return root;

        if (key < root.data) root.left = delete(root.left, key);
        else if (key > root.data) root.right = delete(root.right, key);
        else {
            // Node with one or no child
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // Node with two children
            root.data = minValueNode(root.right).data;
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    // COUNT NODES
    public int count(Node root) {
        if (root == null) return 0;
        return 1 + count(root.left) + count(root.right);
    }

    // TEST
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Search 40: " + tree.search(tree.root, 40));
        System.out.println("Count: " + tree.count(tree.root));

        tree.root = tree.delete(tree.root, 70);
        System.out.print("After deleting 70: ");
        tree.inorder(tree.root);
    }
}
