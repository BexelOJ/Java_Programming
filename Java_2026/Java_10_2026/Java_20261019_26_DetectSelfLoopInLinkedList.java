
public class Java_20261019_26_DetectSelfLoopInLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean hasSelfLoop(Node head) {
        Node current = head;

        while (current != null) {
            if (current.next == current) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;

        // Self-loop: node 30 points to itself.
        third.next = third;

        System.out.println(
            "Self-loop exists: " + hasSelfLoop(head)
        );
    }
}




