public class queueinLL {
    // Linked List Node definition
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and Tail pointers for the Queue
    static Node head = null;
    static Node tail = null;

    // Check if queue is empty
    public static boolean isEmpty() {
        return head == null && tail == null;
    }

    // Add element to the queue (Enqueue)
    public static void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

     // Remove 
    public static int remove() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        int front = head.data;

    

    public static void main(String[] args) {
        // Adding
        add(1);
        add(2);
        add(3);

        // Printing
        // while (!isEmpty()) {
        //     System.out.println(peek());
        //     remove();
        // }
    }
}