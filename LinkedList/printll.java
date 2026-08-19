public class PrintLL{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }


   public static Node head;
   public static Node tail;     

//methods
public void addLast(int data){
    if(head == null){
        Node newNode = new Node(data);
        head = tail = newNode;
        return;
    }
    //step -1 create new node
    Node newNode = new Node(data);
    //step -2 link new node with tail
    tail.next = newNode; //link
    //step -3 update tail
    tail = newNode;
}


public void print(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + "->");
        temp = temp.next;
    }
    System.out.println("null");
}

public static void main(String[] args) {
    PrintLL ll = new PrintLL();
    ll.addLast(2);
    ll.addLast(1);
    ll.print();
}
}