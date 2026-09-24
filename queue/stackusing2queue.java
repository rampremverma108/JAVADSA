import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queue {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push element onto stack - O(1)
    public void push(int x) {
        q1.add(x);
    }

    // Removes the element on top of the stack and returns it - O(N)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int poppedElement = q1.remove();

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return poppedElement;
    }

    // Get the top element - O(N)
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        int topElement = pop();
        push(topElement); // Put it back into the stack
        return topElement;
    }

    // Return whether the stack is empty - O(1)
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        StackUsing2Queue stack = new StackUsing2Queue();

        System.out.println("Pushing elements: 10, 20, 30");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top()); // Should print 30

        System.out.println("Popped element: " + stack.pop()); // Should print 30
        System.out.println("Top element after pop: " + stack.top()); // Should print 20

        System.out.println("Popped element: " + stack.pop()); // Should print 20
        System.out.println("Popped element: " + stack.pop()); // Should print 10

        System.out.println("Is stack empty? " + stack.isEmpty()); // Should print true

        // Attempting pop on an empty stack
        System.out.println("Popped element from empty stack: " + stack.pop()); // Should print -1
    }
}