
public class Java_20261019_03_FindSecondMiddleNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node findSecondMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        Node middle = findSecondMiddle(head);

        System.out.println("Second middle: " + middle.data);
    }
}



