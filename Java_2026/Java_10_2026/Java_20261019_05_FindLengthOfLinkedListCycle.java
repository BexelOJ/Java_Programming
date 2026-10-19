
public class Java_20261019_05_FindLengthOfLinkedListCycle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int cycleLength(Node head) {
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
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        System.out.println("Cycle length: " + cycleLength(head));
    }
}



