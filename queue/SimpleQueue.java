public class SimpleQueue {
    private int[] data;   // Array to hold queue elements
    private int front;    // Index of the front element
    private int rear;     // Index where the next element will be added
    private int count;    // Total items currently in queue

    // Constructor: initialize queue with a fixed capacity
    public SimpleQueue(int capacity) {
        data = new int[capacity];
        front = 0;
        rear = 0;
        count = 0;
    }

    // 1. ADD (Enqueue) - adds an element to the back
    public void add(int value) {
        if (count == data.length) {
            System.out.println("Queue is Full!");
            return;
        }
        data[rear] = value;
        rear = (rear + 1) % data.length; // Move rear forward (wraps around)
        count++;
        System.out.println("Added: " + value);
    }

    // 2. REMOVE (Dequeue) - removes and returns the front element
    public int remove() {
        if (count == 0) {
            System.out.println("Queue is Empty!");
            return -1; // Default error value
        }
        int removedValue = data[front];
        front = (front + 1) % data.length; // Move front forward (wraps around)
        count--;
        System.out.println("Removed: " + removedValue);
        return removedValue;
    }

    // Helper method to look at the front element without removing it
    public int peek() {
        if (count == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return data[front];
    }
}