import java.util.Queue;
import java.util.ArrayDeque; // java.util.LinkedList

public class queueJCF {
    public static void main(String[] args) {
        // ArrayDeque or LinkedList
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        // Printing
        while (!q.isEmpty()) {
            System.out.println(q.peek()); // Looks at the front element
            q.remove();                   // Removes the front element
        }
    }
}