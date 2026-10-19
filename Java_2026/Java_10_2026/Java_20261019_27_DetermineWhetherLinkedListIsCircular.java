
import java.util.HashSet;
import java.util.Set;

public class Java_20261019_27_DetermineWhetherLinkedListIsCircular {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean isCircular(Node head) {
        if (head == null) {
            return false;
        }

        Set<Node> visited = new HashSet<>();
        Node current = head;

        while (current != null) {
            if (current == head && !visited.isEmpty()) {
                return true;
            }

            if (!visited.add(current)) {
                return false;
            }

            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;

        System.out.println("Circular: " + isCircular(head));
    }
}




