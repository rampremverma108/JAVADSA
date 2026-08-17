class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCreation {
    public static void main(String[] args) {
        // 1. Create individual nodes
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        // 2. Connect the nodes (Link them)
        node1.next = node2; // 10 -> 20
        node2.next = node3; // 20 -> 30

        // 3. Head points to the start of the list
        Node head = node1;

        // 4. Access data using references
        System.out.println(head.data);           // Prints: 10
        System.out.println(head.next.data);      // Prints: 20
        System.out.println(head.next.next.data); // Prints: 30
    }
}