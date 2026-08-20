public class RemoveFirstLast {
    // Node Structure
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // 1. Add First: Inserts node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // 2. Add Last: Appends node to the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // 3A. Add Middle by Index: Inserts at a specific 0-based index
    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // 3B. Add Middle automatically: Inserts directly after the calculated middle node
    public void addMiddle(int data) {
        if (head == null) {
            addFirst(data);
            return;
        }
        
        Node slow = head;
        Node fast = head.next; // fast starts at head.next to find the left-middle node

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newNode = new Node(data);
        newNode.next = slow.next;
        slow.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Print Linked List
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove first
    public int removeFirst() {
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (head.next == null) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
    }
    


    public static void main(String[] args) {
        AddMiddle ll = new AddMiddle();

        System.out.println("--- Building Base List ---");
        ll.addFirst(20);        // List: 20 -> null
        ll.addFirst(10);        // List: 10 -> 20 -> null
        ll.addLast(40);         // List: 10 -> 20 -> 40 -> null
        ll.addLast(50);         // List: 10 -> 20 -> 40 -> 50 -> null
        ll.print();

        System.out.println("\n--- Adding by Index (addMiddle(idx, data)) ---");
        ll.addMiddle(2, 30);    // Inserts 30 at index 2
        ll.print();

        System.out.println("\n--- Adding at Middle automatically (addMiddle(data)) ---");
        ll.addMiddle(25);       // Finds middle (20) and inserts 25 after it
        ll.removeFirst();
        ll.print();
    }
}