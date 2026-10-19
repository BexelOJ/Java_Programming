
public class Java_20261019_07_RemoveCycleFromLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static void removeCycle(Node head) {
        Node slow = head;
        Node fast = head;

        // Detect cycle.
        do {
            if (fast == null || fast.next == null) {
                return;
            }

            slow = slow.next;
            fast = fast.next.next;

        } while (slow != fast);

        // Find cycle starting node.
        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        Node cycleStart = slow;

        // Find the last node in the cycle.
        Node current = cycleStart;

        while (current.next != cycleStart) {
            current = current.next;
        }

        current.next = null;
    }

    static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
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
        fifth.next = third; // Creates a cycle.

        removeCycle(head);

        System.out.print("After removing cycle: ");
        printList(head);
    }
}



