import java.util.*;

public class Java_20261026_15_MergeKSortedArrays {
    static class Node {
        int value, row, col;

        Node(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {
        int[][] arrays = {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };

        PriorityQueue<Node> pq =
            new PriorityQueue<>(Comparator.comparingInt(n -> n.value));

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > 0)
                pq.offer(new Node(arrays[i][0], i, 0));
        }

        List<Integer> result = new ArrayList<>();

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            result.add(node.value);

            int nextCol = node.col + 1;
            if (nextCol < arrays[node.row].length) {
                pq.offer(new Node(
                    arrays[node.row][nextCol], node.row, nextCol
                ));
            }
        }

        System.out.println(result);
    }
}


