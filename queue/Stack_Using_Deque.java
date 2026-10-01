import java.util.Deque;
import java.util.LinkedList;

public class Stack_Using_Deque {
    
    public static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    public static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    public static void main(String[] args) {
        // Stack operations
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Top element: " + s.peek());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Top element after pop: " + s.peek());

        System.out.println("-------------------");

        // Queue operations
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Front element: " + q.peek());
        System.out.println("Removed element: " + q.remove());
        System.out.println("Front element after removal: " + q.peek());
    }
}