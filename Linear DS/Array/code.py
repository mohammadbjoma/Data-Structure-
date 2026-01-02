class Array:
    def __init__(self):
        self.arr = []

    def insert(self, value):
        self.arr.append(value)

    def insert_at(self, index, value):
        self.arr.insert(index, value)

    def delete(self, value):
        if value in self.arr:
            self.arr.remove(value)

    def delete_at(self, index):
        if 0 <= index < len(self.arr):
            self.arr.pop(index)

    def search(self, value):
        return self.arr.index(value) if value in self.arr else -1

    def traverse(self):
        print(self.arr)


# -------- TEST --------
print("ARRAY TEST")
arr = Array()
arr.insert(10)
arr.insert(20)
arr.insert_at(1, 15)
arr.traverse()
arr.delete(15)
arr.traverse()
print("Search 20:", arr.search(20))
print()
