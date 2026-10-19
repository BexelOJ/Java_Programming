
public class Java_20261019_34_RotateLinkedListByKPositions {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k = k % length;

        if (k == 0) {
            return head;
        }

        // Temporarily form a circular list.
        tail.next = head;

        int stepsToNewTail = length - k;
        Node newTail = head;

        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        display(head);

        head = rotateRight(head, 2);

        display(head);
    }
}




