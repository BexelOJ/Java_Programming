
import java.util.HashSet;
import java.util.Set;

public class Java_20261019_18_RemoveDuplicatesFromUnsortedLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node removeDuplicates(Node head) {
        Set<Integer> seen = new HashSet<>();

        Node current = head;
        Node prev = null;

        while (current != null) {
            if (seen.contains(current.data)) {
                prev.next = current.next;
                current.next = null;
                current = prev.next;
            } else {
                seen.add(current.data);
                prev = current;
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
        Node head = new Node(30);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(40);
        head.next.next.next.next.next.next = new Node(20);

        display(head);

        head = removeDuplicates(head);

        display(head);
    }
}



