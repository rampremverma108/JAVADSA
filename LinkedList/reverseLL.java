public class reverseLL{

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

    // Add Last: Appends node to the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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

    // Search in Linked List
    public int search(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1; //if output Key not found
    }

    //search Recursively
    public int searchRec(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = searchRec(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    // Reverse Linked List
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next; // Store the next node
            curr.next = prev; // Reverse the link
            prev = curr;      // Move prev to current node
            curr = next;      // Move to the next node
        }
        head = prev; // Update head to the new first node
    }

    //remove nth node from end of linked list
    public void removeNthFromEnd(int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;

        // Move first n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node from end
        second.next = second.next.next;

        head = dummy.next; // Update head in case the first node was removed
    }

    public static void main(String args[]){
       reverseLL ll = new reverseLL();
       ll.addLast(10);
       ll.addLast(20);
       ll.addLast(30);
       ll.addLast(40);
       ll.addLast(50);
       ll.print();
       System.out.println("Search value at Index: " + ll.search(40)); // Output: Index of 40: 3
       System.out.println("Search value at Index (Recursively): " + ll.searchRec(head, 30)); // Output: Index of 30: 2
        ll.reverse();
        ll.print(); // Output: 50 -> 40 -> 30 -> 20 -> 10 -> null
        ll.removeNthFromEnd(2);
        ll.print(); // Output: 50 -> 40 -> 30 -> 10 ->
    }
}
