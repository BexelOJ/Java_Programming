
public class Java_20261019_35_FindMiddleAndReverseSecondHalf {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node findMiddleAndReverseSecondHalf(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle node: " + slow.data);

        slow.next = reverse(slow.next);

        return head;
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
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

        head = findMiddleAndReverseSecondHalf(head);

        display(head);
    }
}




