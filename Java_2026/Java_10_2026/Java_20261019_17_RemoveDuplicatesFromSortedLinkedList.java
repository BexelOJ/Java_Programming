
public class Java_20261019_17_RemoveDuplicatesFromSortedLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node removeDuplicates(Node head) {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                Node duplicate = current.next;
                current.next = duplicate.next;
                duplicate.next = null;
            } else {
                current = current.next;
            }
        }

        return head;
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
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(40);
        head.next.next.next.next.next.next = new Node(40);

        display(head);

        head = removeDuplicates(head);

        display(head);
    }
}




