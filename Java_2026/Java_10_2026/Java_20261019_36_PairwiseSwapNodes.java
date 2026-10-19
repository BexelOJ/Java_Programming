
public class Java_20261019_36_PairwiseSwapNodes {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node pairwiseSwap(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }

        return dummy.next;
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

        head = pairwiseSwap(head);

        display(head);
    }
}



