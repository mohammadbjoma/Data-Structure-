class Queue:
    def __init__(self):
        self.queue = []

    def enqueue(self, value):
        self.queue.append(value)

    def dequeue(self):
        return self.queue.pop(0) if not self.is_empty() else None

    def front(self):
        return self.queue[0] if not self.is_empty() else None

    def is_empty(self):
        return len(self.queue) == 0

    def display(self):
        print(self.queue)


# -------- TEST --------
q = Queue()
q.enqueue(1)
q.enqueue(2)
q.enqueue(3)
q.display()
print("Dequeue:", q.dequeue())
print("Front:", q.front())
q.display()
print()
