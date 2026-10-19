
public class Java_20261019_20_FindIntersectionNodeOfTwoLinkedLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node getIntersectionNode(Node headA, Node headB) {
        Node a = headA;
        Node b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
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

        Node intersection = getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println(
                "Intersection node: " + intersection.data
            );
        } else {
            System.out.println("No intersection found");
        }
    }
}



