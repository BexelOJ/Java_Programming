
public class Java_20261019_12_ReverseLinkedListRecursively {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverse(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
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

        display(head);

        head = reverse(head);

        display(head);
    }
}



