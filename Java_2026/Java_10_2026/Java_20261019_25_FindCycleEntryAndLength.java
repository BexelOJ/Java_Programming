
public class Java_20261019_25_FindCycleEntryAndLength {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node findCycleEntry(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }

    static int findCycleLength(Node entry) {
        if (entry == null) {
            return 0;
        }

        int length = 1;
        Node current = entry.next;

        while (current != entry) {
            length++;
            current = current.next;
        }

        return length;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        // Create cycle: 50 -> 30
        head.next.next.next.next.next = head.next.next;

        Node entry = findCycleEntry(head);

        if (entry != null) {
            System.out.println("Cycle entry: " + entry.data);
            System.out.println(
                "Cycle length: " + findCycleLength(entry)
            );
        } else {
            System.out.println("No cycle found");
        }
    }
}




