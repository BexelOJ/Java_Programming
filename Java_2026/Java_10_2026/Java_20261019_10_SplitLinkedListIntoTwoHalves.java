
public class Java_20261019_10_SplitLinkedListIntoTwoHalves {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class SplitResult {
        Node firstHalf;
        Node secondHalf;

        SplitResult(Node firstHalf, Node secondHalf) {
            this.firstHalf = firstHalf;
            this.secondHalf = secondHalf;
        }
    }

    static SplitResult splitList(Node head) {
        if (head == null) {
            return new SplitResult(null, null);
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = slow.next;
        slow.next = null;

        return new SplitResult(head, secondHalf);
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        SplitResult result = splitList(head);

        System.out.print("First half: ");
        printList(result.firstHalf);

        System.out.print("Second half: ");
        printList(result.secondHalf);
    }
}



