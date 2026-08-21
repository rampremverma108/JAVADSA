public class SearchinLL{

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

    public static void main(String args[]){
       SearchinLL ll = new SearchinLL();
       ll.addLast(10);
       ll.addLast(20);
       ll.addLast(30);
       ll.addLast(40);
       ll.addLast(50);
       ll.print();
       System.out.println("Search value at Index: " + ll.search(40)); // Output: Index of 40: 3
    }
}
