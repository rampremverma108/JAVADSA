import java.util.*;

public class stackCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

       while(!stack.isEmpty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }
}
}