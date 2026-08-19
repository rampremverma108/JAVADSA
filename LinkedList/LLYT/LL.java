class LL {
    // 1. List ke start ko track karne ke liye head pointer
    Node head;

    // 2. Inner Node class (static rakhna behtar rehta hai)
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // 3. List ke end me naya node add karne ka method
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // 4. List ke saare elements print karne ka method
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.add("1");
        list.add("2");
        list.add("3");
        list.printList();
    }
}