public class AddFirstElement{
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
public void addFirst(int data){

    if(head == null){
        Node newNode = new Node(data);
        head = tail = newNode;
        return;
    }
    //step -1 create new node
    Node newNode = new Node(data); 

    //step -2 link new node with head
    newNode.next = head; //link

    //step -3 update head
    head = newNode;
}  
    public static void main(String[] args) {
        AddFirstElement ll = new AddFirstElement();
        ll.addFirst(2); 
        ll.addFirst(1);
        
      
    }
}