
import java.util.*;

public class Java_20261022_34_HuffmanCoding {

    static class Node {
        char character;
        int frequency;
        Node left, right;

        Node(char character, int frequency) {
            this.character = character;
            this.frequency = frequency;
        }

        Node(Node left, Node right) {
            this.character = '\0';
            this.frequency = left.frequency + right.frequency;
            this.left = left;
            this.right = right;
        }

        boolean isLeaf() {
            return left == null && right == null;
        }
    }

    static void printCodes(Node node, String code) {
        if (node == null) {
            return;
        }

        if (node.isLeaf()) {
            System.out.println(
                node.character + ": " +
                (code.isEmpty() ? "0" : code)
            );
            return;
        }

        printCodes(node.left, code + "0");
        printCodes(node.right, code + "1");
    }

    public static void main(String[] args) {
        char[] characters = {'A', 'B', 'C', 'D', 'E', 'F'};
        int[] frequencies = {5, 9, 12, 13, 16, 45};

        PriorityQueue<Node> pq = new PriorityQueue<>(
            Comparator.comparingInt(node -> node.frequency)
        );

        for (int i = 0; i < characters.length; i++) {
            pq.offer(new Node(characters[i], frequencies[i]));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            pq.offer(new Node(left, right));
        }

        System.out.println("Huffman codes:");
        printCodes(pq.poll(), "");
    }
}



