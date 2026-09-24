import java.util.*;

public class stackusing2queue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (q1.isEmpty()) {
            return -1; // Stack is empty
        }
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int poppedElement = q1.remove();
        // Swap the names of the queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return poppedElement;
    }

    public int top() {
        if (q1.isEmpty()) {
            return -1; // Stack is empty
        }
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int topElement = q1.peek();
        q2.add(q1.remove());
        // Swap the names of the queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return topElement;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}