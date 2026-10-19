
public class Java_20261019_15_RemoveNthNodeFromEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node removeNthFromEnd(Node head, int n) {
        if (n <= 0) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;

            if (fast == null) {
                return head;
            }
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        Node target = slow.next;
        slow.next = target.next;
        target.next = null;

        return dummy.next;
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

        head = removeNthFromEnd(head, 2);

        display(head);
    }
}



