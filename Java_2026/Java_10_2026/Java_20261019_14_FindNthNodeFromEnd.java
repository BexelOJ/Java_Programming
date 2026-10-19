
public class Java_20261019_14_FindNthNodeFromEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node findNthFromEnd(Node head, int n) {
        if (n <= 0) {
            return null;
        }

        Node fast = head;
        Node slow = head;

        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int n = 2;
        Node result = findNthFromEnd(head, n);

        if (result != null) {
            System.out.println("Nth node from end: " + result.data);
        } else {
            System.out.println("Invalid n");
        }
    }
}



