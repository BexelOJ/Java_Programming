
public class Java_20261019_19_DetectIntersectionOfTwoLinkedLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean hasIntersection(Node headA, Node headB) {
        Node a = headA;
        Node b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a != null;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node common = new Node(30);
        common.next = new Node(40);
        common.next.next = new Node(50);

        Node headA = new Node(10);
        headA.next = new Node(20);
        headA.next.next = common;

        Node headB = new Node(15);
        headB.next = common;

        display(headA);
        display(headB);

        System.out.println(
            "Intersection exists: " +
            hasIntersection(headA, headB)
        );
    }
}



