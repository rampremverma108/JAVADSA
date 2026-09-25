//first non repeating character in a string in queue 
import java.util.*;
public class nonRepeatingString {

    public static void printNonRepeating(String str){
       int[] freq = new int[26]; // only lowercase letters
        Queue<Character> queue = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
            queue.add(ch);

            // Remove characters from the front that have repeated
            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.remove();
            }

            if (queue.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(queue.peek() + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
