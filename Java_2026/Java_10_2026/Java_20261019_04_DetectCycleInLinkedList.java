
public class Java_20261019_04_DetectCycleInLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creates a cycle.

        System.out.println("Cycle exists: " + hasCycle(head));
    }
}



