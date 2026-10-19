
public class Java_20261019_38_MergeTwoSortedLinkedLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node merge(Node headA, Node headB) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (headA != null && headB != null) {
            if (headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            } else {
                tail.next = headB;
                headB = headB.next;
            }

            tail = tail.next;
        }

        if (headA != null) {
            tail.next = headA;
        } else {
            tail.next = headB;
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
        Node a = new Node(10);
        a.next = new Node(30);
        a.next.next = new Node(50);

        Node b = new Node(20);
        b.next = new Node(40);
        b.next.next = new Node(60);

        System.out.println("List A:");
        display(a);

        System.out.println("List B:");
        display(b);

        Node merged = merge(a, b);

        System.out.println("Merged list:");
        display(merged);
    }
}




