
public class Java_20261019_01_FindMiddleNodeOfLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        printList(head);

        Node middle = findMiddle(head);
        System.out.println("Middle node: " + middle.data);
    }
}



