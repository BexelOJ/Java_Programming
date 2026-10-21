import java.util.*;

public class Java_20261026_44_FindKthLargestXORCoordinateValue {
    public static void main(String[] args) {
        int[][] matrix = {
            {5, 2},
            {1, 6}
        };
        int k = 2;

        int rows = matrix.length;
        int cols = matrix[0].length;

        if (k < 1 || k > rows * cols)
            throw new IllegalArgumentException("Invalid k");

        int[][] prefix = new int[rows][cols];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                prefix[r][c] = matrix[r][c];

                if (r > 0)
                    prefix[r][c] ^= prefix[r - 1][c];
                if (c > 0)
                    prefix[r][c] ^= prefix[r][c - 1];
                if (r > 0 && c > 0)
                    prefix[r][c] ^= prefix[r - 1][c - 1];

                minHeap.offer(prefix[r][c]);

                if (minHeap.size() > k)
                    minHeap.poll();
            }
        }

        System.out.println(minHeap.peek());
    }
}


