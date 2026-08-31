import java.util.*;

public class CircularQueue {
    static class Queue {
       static int arr[];
       static int size;
       static int rear;
       static int front;

        // Constructor belongs inside the Queue class
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear +1) % size == front;
        }
        //add
        public void add(int data) {
            if (isFull()) { 
                System.out.println("Queue is full");
                return;
            }

            //add 1 st element
            if(front == -1){
                front = 0;
            }
            rear = (rear +1) % size;
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