import java.util.Arrays;

public class Java_20261025_39_CherryPickup {
    static int[][] grid;
    static int[][][] memo;
    static int rows, cols;

    static int solve(int r, int c1, int c2) {
        if (c1 < 0 || c2 < 0 || c1 >= cols || c2 >= cols)
            return Integer.MIN_VALUE / 2;

        if (r == rows) return 0;

        if (memo[r][c1][c2] != Integer.MIN_VALUE)
            return memo[r][c1][c2];

        int cherries = grid[r][c1];
        if (c1 != c2) cherries += grid[r][c2];

        int best = Integer.MIN_VALUE / 2;

        for (int d1 = -1; d1 <= 1; d1++) {
            for (int d2 = -1; d2 <= 1; d2++) {
                best = Math.max(best,
                    solve(r + 1, c1 + d1, c2 + d2));
            }
        }

        return memo[r][c1][c2] = cherries + best;
    }

    public static void main(String[] args) {
        grid = new int[][] {
            {3, 1, 1},
            {2, 5, 1},
            {1, 5, 5},
            {2, 1, 1}
        };

        rows = grid.length;
        cols = grid[0].length;

        memo = new int[rows][cols][cols];

        for (int[][] layer : memo)
            for (int[] row : layer)
                Arrays.fill(row, Integer.MIN_VALUE);

        System.out.println(solve(0, 0, cols - 1)); // 24
    }
}


