import java.util.*;

public class Java_20261026_39_FindKthSmallestElementInSortedMatrix {
    static class Cell {
        int value, row, col;

        Cell(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;

        int rows = matrix.length;
        int cols = matrix[0].length;

        if (k < 1 || k > rows * cols)
            throw new IllegalArgumentException("Invalid k");

        PriorityQueue<Cell> pq =
            new PriorityQueue<>(Comparator.comparingInt(c -> c.value));

        for (int r = 0; r < rows; r++)
            pq.offer(new Cell(matrix[r][0], r, 0));

        Cell current = null;

        for (int i = 0; i < k; i++) {
            current = pq.poll();

            if (current.col + 1 < cols) {
                int nextCol = current.col + 1;
                pq.offer(new Cell(
                    matrix[current.row][nextCol],
                    current.row,
                    nextCol
                ));
            }
        }

        System.out.println(current.value);
    }
}


