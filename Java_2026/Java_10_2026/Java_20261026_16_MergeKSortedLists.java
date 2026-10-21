import java.util.*;

public class Java_20261026_16_MergeKSortedLists {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq =
            new PriorityQueue<>(Comparator.comparingInt(n -> n.val));

        for (ListNode node : lists) {
            if (node != null)
                pq.offer(node);
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            tail.next = node;
            tail = node;

            if (node.next != null)
                pq.offer(node.next);
        }

        tail.next = null;
        return dummy.next;
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(4);
        a.next.next = new ListNode(7);

        ListNode b = new ListNode(2);
        b.next = new ListNode(5);

        ListNode c = new ListNode(3);
        c.next = new ListNode(6);

        ListNode[] lists = {a, b, c};
        printList(mergeKLists(lists));
    }
}


