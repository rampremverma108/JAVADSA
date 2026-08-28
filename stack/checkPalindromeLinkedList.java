class Node {
    char val;
    Node next;

    Node(char val) {
        this.val = val;
        this.next = null;
    }
}

public class checkPalindromeLinkedList {

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        // 1. Find the middle of the linked list
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the second half in-place
        Node prev = null;
        Node curr = slow;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // 3. Compare the first half and the reversed second half
        Node firstHalf = head;
        Node secondHalf = prev; // Head of the reversed second half
        boolean isPalin = true;

        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                isPalin = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return isPalin;
    }

    public static void main(String[] args) {
        // Constructing linked list: A -> B -> C -> B -> A
        Node head = new Node('A');
        head.next = new Node('B');
        head.next.next = new Node('C');
        head.next.next.next = new Node('B');
        head.next.next.next.next = new Node('A');

        if (isPalindrome(head)) {
            System.out.println("Yes It is Palindrome");
        } else {
            System.out.println("No It is Not Palindrome");
        }
    }
}