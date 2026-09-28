import java.util.*;

public class InterLeaveQueue {
    public static void interLeaveQueue(Queue<Integer> queue) {
        if (queue.size() % 2 != 0) {
            System.out.println("Queue size must be even.");
            return;
        }

        Queue<Integer> firstHalf = new LinkedList<>();
        int halfSize = queue.size() / 2;

        for (int i = 0; i < halfSize; i++) {
            firstHalf.add(queue.poll());
        }

        while (!firstHalf.isEmpty()) {
            queue.add(firstHalf.poll()); 
            queue.add(queue.poll());  
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println("Original Queue: " + queue);
        interLeaveQueue(queue);
        System.out.println("Interleaved Queue: " + queue);
    }
}