//double eneded queue

import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.addFirst(3);
        dq.addLast(4);

        System.out.println("Deque: " + dq);

        System.out.println("First Element: " + dq.getFirst());
        System.out.println("Last Element: " + dq.getLast());

        dq.removeFirst();
        System.out.println("After removing first element: " + dq);

        dq.removeLast();
        System.out.println("After removing last element: " + dq);
    }
}