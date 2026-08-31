import java.util.*;

public class CircularQueue {
    static class Queue {
        private int arr[];
        private int size;
        private int rear;
        private int front;

        // Constructor
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add (Enqueue) - O(1)
        public void add(int data) {
            if (isFull()) { 
                System.out.println("Queue is full");
                return;
            }

            // Set front to 0 when inserting the first element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove (Dequeue) - O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            int result = arr[front];

            // If queue has only one element, reset to initial state
            if (rear == front) {
                rear = -1;
                front = -1;
            } else {
                front = (front + 1) % size; // Move front circularly
            }

            return result;
        }

        // Peek - O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue Q = new Queue(5);
        Q.add(1);
        Q.add(2);
        Q.add(3);

        while (!Q.isEmpty()) {
            System.out.println(Q.peek());
            Q.remove();
        }
    }
}