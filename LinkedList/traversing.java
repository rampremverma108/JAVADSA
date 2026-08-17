class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void printList(Node head) {
        Node current = head; // Start at the beginning
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; // Move reference to the next node
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Setup a linked list: 5 -> 15 -> 25 -> NULL
        Node head = new Node(5);
        head.next = new Node(15);
        head.next.next = new Node(25);

        // Traversal
        printList(head);
        // Output: 5 -> 15 -> 25 -> NULL
    }
}