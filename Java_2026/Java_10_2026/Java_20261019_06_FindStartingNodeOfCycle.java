
public class Java_20261019_06_FindStartingNodeOfCycle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node findCycleStart(Node head) {
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

        Node start = findCycleStart(head);

        if (start != null) {
            System.out.println("Cycle starts at: " + start.data);
        } else {
            System.out.println("No cycle");
        }
    }
}


