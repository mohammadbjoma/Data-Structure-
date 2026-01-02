class Stack:
    def __init__(self):
        self.stack = []

    def push(self, value):
        self.stack.append(value)

    def pop(self):
        return self.stack.pop() if not self.is_empty() else None

    def peek(self):
        return self.stack[-1] if not self.is_empty() else None

    def is_empty(self):
        return len(self.stack) == 0

    def display(self):
        print(self.stack)


# -------- TEST --------
s = Stack()
s.push(10)
s.push(20)
s.push(30)
s.display()
print("Pop:", s.pop())
print("Peek:", s.peek())
s.display()
print()
