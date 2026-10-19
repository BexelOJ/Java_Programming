
public class Java_20261021_47_MergeKSortedLinkedListsUsingDivideAndConquer {

    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    static ListNode mergeKLists(ListNode[] lists, int left, int right) {
        if (left > right) {
            return null;
        }

        if (left == right) {
            return lists[left];
        }

        int mid = left + (right - left) / 2;

        ListNode a = mergeKLists(lists, left, mid);
        ListNode b = mergeKLists(lists, mid + 1, right);

        return mergeTwoLists(a, b);
    }

    static ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (a != null && b != null) {
            if (a.value <= b.value) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        tail.next = (a != null) ? a : b;

        return dummy.next;
    }

    static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for (int value : values) {
            tail.next = new ListNode(value);
            tail = tail.next;
        }

        return dummy.next;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        ListNode[] lists = {
            createList(new int[]{1, 4, 7}),
            createList(new int[]{2, 5, 8}),
            createList(new int[]{3, 6, 9})
        };

        ListNode result = mergeKLists(lists, 0, lists.length - 1);

        System.out.print("Merged list: ");
        printList(result);
    }
}



