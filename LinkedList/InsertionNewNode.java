class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head; // Initially null

    // Add a new node at the very front
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Point new node to current head
        head = newNode;      // Update head to be the new node
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(30); // List: 30 -> NULL
        list.insertAtBeginning(20); // List: 20 -> 30 -> NULL
        list.insertAtBeginning(10); // List: 10 -> 20 -> 30 -> NULL

        list.display();
        // Output: 10 -> 20 -> 30 -> NULL
    }
}