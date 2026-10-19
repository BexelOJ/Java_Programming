
import java.util.ArrayDeque;
import java.util.Deque;

public class Java_20261019_37_CompareTwoLinkedListsInReverse {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Deque<Integer> buildStack(Node head) {
        Deque<Integer> stack = new ArrayDeque<>();

        while (head != null) {
            stack.push(head.data);
            head = head.next;
        }

        return stack;
    }

    static boolean compareInReverse(Node headA, Node headB) {
        Deque<Integer> stackA = buildStack(headA);
        Deque<Integer> stackB = buildStack(headB);

        if (stackA.size() != stackB.size()) {
            return false;
        }

        while (!stackA.isEmpty()) {
            if (!stackA.pop().equals(stackB.pop())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        a.next = new Node(20);
        a.next.next = new Node(30);

        Node b = new Node(10);
        b.next = new Node(20);
        b.next.next = new Node(30);

        System.out.println(
            "Equal in reverse: " + compareInReverse(a, b)
        );

        Node c = new Node(10);
        c.next = new Node(25);
        c.next.next = new Node(30);

        System.out.println(
            "Equal in reverse: " + compareInReverse(a, c)
        );
    }
}




