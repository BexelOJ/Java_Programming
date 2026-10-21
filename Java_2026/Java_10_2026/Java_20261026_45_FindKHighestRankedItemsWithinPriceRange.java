import java.util.*;

public class Java_20261026_45_FindKHighestRankedItemsWithinPriceRange {
    static class Cell {
        int row, col, distance;

        Cell(int row, int col, int distance) {
            this.row = row;
            this.col = col;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 0},
            {1, 3, 4},
            {0, 5, 6}
        };

        int low = 2, high = 5;
        int startRow = 0, startCol = 0;
        int k = 4;

        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];
        Queue<Cell> queue = new LinkedList<>();
        List<int[]> items = new ArrayList<>();

        queue.offer(new Cell(startRow, startCol, 0));
        visited[startRow][startCol] = true;

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty()) {
            Cell cell = queue.poll();
            int price = grid[cell.row][cell.col];

            if (price >= low && price <= high) {
                items.add(new int[]{
                    cell.distance, price, cell.row, cell.col
                });
            }

            for (int[] d : directions) {
                int nr = cell.row + d[0];
                int nc = cell.col + d[1];

                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols
                    && !visited[nr][nc] && grid[nr][nc] > 0) {
                    visited[nr][nc] = true;
                    queue.offer(new Cell(nr, nc, cell.distance + 1));
                }
            }
        }

        items.sort((a, b) -> {
            for (int i = 0; i < 4; i++) {
                int cmp = Integer.compare(a[i], b[i]);
                if (cmp != 0) return cmp;
            }
            return 0;
        });

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < Math.min(k, items.size()); i++) {
            result.add(Arrays.asList(items.get(i)[2], items.get(i)[3]));
        }

        System.out.println(result);
    }
}


