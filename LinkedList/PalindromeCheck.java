public class PalindromeCheck {
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

  //find middle
  public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single node is a palindrome
        }

        // Step 1: Find the middle of the linked list
        Node mid = findMid(head);

        // Step 2: Reverse the second half of the linked list
        Node prev = null;
        Node curr = mid;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // Step 3: Compare the first half and the reversed second half
        Node left = head;
        Node right = prev; // 'prev' is now the head of the reversed second half
        while (right != null) {
            if (left.data != right.data) {
                return false; // Not a palindrome
            }
            left = left.next;
            right = right.next;
        }

        return true; // It's a palindrome
    }


    public static void main(String args[]){
        
        PalindromeCheck ll = new PalindromeCheck();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        boolean result = ll.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result);
    }
}