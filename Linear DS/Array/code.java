class ArrayOperations {

    int[] arr;
    int size;

    // Constructor
    ArrayOperations(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // INSERT
    public void insert(int value) {
        if (size == arr.length) {
            System.out.println("Array is full");
            return;
        }
        arr[size++] = value;
    }

    // DELETE (by value)
    public void delete(int value) {
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

    // TRAVERSE
    public void traverse() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // SEARCH
    public boolean search(int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key)
                return true;
        }
        return false;
    }

    // COUNT
    public int count() {
        return size;
    }

    // TEST
    public static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations(5);

        arr.insert(10);
        arr.insert(20);
        arr.insert(30);

        arr.traverse();
        System.out.println("Count: " + arr.count());
        System.out.println("Search 20: " + arr.search(20));

        arr.delete(20);
        arr.traverse();
    }
}
