
public class Java_20261019_28_FindEntryPointOfCircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node findEntryPoint(Node head) {
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
        head.next = new Node(20);
        Node entry = new Node(30);
        head.next.next = entry;

        entry.next = new Node(40);
        entry.next.next = new Node(50);
        entry.next.next.next = entry;

        Node result = findEntryPoint(head);

        if (result != null) {
            System.out.println("Entry point: " + result.data);
        } else {
            System.out.println("No cycle found");
        }
    }
}




