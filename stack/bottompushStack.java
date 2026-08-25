//push bottom of stack
import java.util.*;

public class bottompushStack {

    public static void pushBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushBottom(stack, data);
        stack.push(top);
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

      pushBottom(stack, 4);

        // Print the stack by removing the elements
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
}
}
