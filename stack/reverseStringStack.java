import java.util.*;

//reverse string using stack
public class reverseStringStack {
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();

       int idx = 0;
        while (idx < str.length()) {
            stack.push(str.charAt(idx));
            idx++;
        }

        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            char curr = stack.pop();
            reversedStr.append(curr);
        }

        return reversedStr.toString();
    }
        public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverseString(str));
}
}
