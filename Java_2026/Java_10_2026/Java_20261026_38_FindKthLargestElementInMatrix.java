import java.util.*;

public class Java_20261026_38_FindKthLargestElementInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int k = 4;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int[] row : matrix) {
            for (int n : row) {
                minHeap.offer(n);
                if (minHeap.size() > k)
                    minHeap.poll();
            }
        }

        if (k < 1 || k > matrix.length * matrix[0].length)
            throw new IllegalArgumentException("Invalid k");

        System.out.println(minHeap.peek());
    }
}


