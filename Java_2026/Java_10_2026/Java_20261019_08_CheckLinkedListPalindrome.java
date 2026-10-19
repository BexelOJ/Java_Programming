
public class Java_20261019_08_CheckLinkedListPalindrome {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node reverse(Node head) {
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        return previous;
    }

    static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow.next);
        Node firstHalf = head;
        Node currentSecond = secondHalf;
        boolean palindrome = true;

        while (currentSecond != null) {
            if (firstHalf.data != currentSecond.data) {
                palindrome = false;
                break;
            }

            firstHalf = firstHalf.next;
            currentSecond = currentSecond.next;
        }

        // Restore the original list.
        slow.next = reverse(secondHalf);

        return palindrome;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println("Is palindrome: " + isPalindrome(head));
    }
}


