class LL{
    class Node{
        String data;
        Node next;

        Node(String data){ 
            this.data = data;
            this.next = null;
        }
    }

    //add - firstadd, lastadd 
    public Node addFirst(String data){
        Node newNode = new Node(data);
       if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    public static void main(String[] args){
        LL list = new LL();
        list.add("1");
        list.add("2");
        list.add("3");
        list.printList();
    }
}