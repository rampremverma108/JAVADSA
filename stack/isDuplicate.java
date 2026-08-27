import java.util.*;

public class isDuplicate {
    public static boolean checkDuplicate(String str) { // O(n)
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // 1. Closing parenthesis aane par inner elements count karo
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                s.pop(); // '(' ko bhi stack se bahar nikalo

                // Agar '(' aur ')' ke beech ek bhi character nahi tha (count < 1), 
                // toh matlab yeh duplicate brackets hain.
                if (count < 1) {
                    return true; // Duplicate found
                }
            } else {
                // 2. Opening brackets, operators, aur operands ko stack mein push karo
                s.push(ch);
            }
        }

        // Loop poora hone par agar koi duplicate nahi mila
        return false;
    }

    public static void main(String args[]) {
        String str = "((a+b))"; // Output: true
        String str2 = "(a-b)";   // Output: false

        System.out.println(checkDuplicate(str));  // true
        System.out.println(checkDuplicate(str2)); // false
    }
}