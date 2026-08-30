import java.util.*;

public class QueueImplementation {
    static class Queue {
        int arr[];
        int size;
        int rear;

        // Constructor belongs inside the Queue class
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1; 
        }

        public void add(int data) {
            if (rear == size - 1) { 
                System.out.println("Queue is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return arr[0];
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