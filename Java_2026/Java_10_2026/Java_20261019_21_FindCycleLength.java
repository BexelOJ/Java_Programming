
public class Java_20261019_21_FindCycleLength {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int findCycleLength(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int length = 1;
                Node current = slow.next;

                while (current != slow) {
                    length++;
                    current = current.next;
                }

                return length;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        // Create a cycle: 50 -> 30
        head.next.next.next.next.next = head.next.next;

        System.out.println("Cycle length: " + findCycleLength(head));
    }
}



