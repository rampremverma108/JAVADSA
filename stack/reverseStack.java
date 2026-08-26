import java.util.Stack;

public class reverseStack {

    public static void pushBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushBottom(stack, data);
        stack.push(top);
    }

    public static void reversemyStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reversemyStack(stack);
        pushBottom(stack, top);
    }

    // Modern/Non-destructive print method
    public static void printStack(Stack<Integer> stack) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("before reverse: ");
        printStack(stack);

        reversemyStack(stack);

        System.out.println("after reverse: ");
        printStack(stack);
    }
}