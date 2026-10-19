
public class Java_20261019_48_FindMeetingPointOfTwoPointerSequences {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node findMeetingPoint(Node headA, Node headB) {
        Node a = headA;
        Node b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
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

        Node meetingPoint = findMeetingPoint(headA, headB);

        if (meetingPoint != null) {
            System.out.println(
                "Meeting point: " + meetingPoint.data
            );
        } else {
            System.out.println("No meeting point");
        }
    }
}



