
public class Java_20261019_32_RestoreLinkedListAfterPalindromeCheck {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean isPalindromeAndRestore(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node reversed = reverse(slow.next);
        slow.next = reversed;

        Node first = head;
        Node second = reversed;
        boolean result = true;

        while (second != null) {
            if (first.data != second.data) {
                result = false;
                break;
            }

            first = first.next;
            second = second.next;
        }

        slow.next = reverse(reversed);

        return result;
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println("Before checking:");
        display(head);

        boolean result = isPalindromeAndRestore(head);

        System.out.println("Palindrome: " + result);

        System.out.println("After checking:");
        display(head);
    }
}



