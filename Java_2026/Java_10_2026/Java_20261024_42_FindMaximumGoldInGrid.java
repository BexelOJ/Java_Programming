public class Java_20261024_42_FindMaximumGoldInGrid {
    static int[][] grid = {
        {0, 6, 0},
        {5, 8, 7},
        {0, 9, 0}
    };

    static int best = 0;

    static void solve(int r, int c, int gold) {
        if (r < 0 || c < 0 || r >= grid.length ||
            c >= grid[0].length || grid[r][c] == 0) return;

        int value = grid[r][c];
        grid[r][c] = 0;

        gold += value;
        best = Math.max(best, gold);

        solve(r + 1, c, gold);
        solve(r - 1, c, gold);
        solve(r, c + 1, gold);
        solve(r, c - 1, gold);

        grid[r][c] = value;
    }

    public static void main(String[] args) {
        for (int r = 0; r < grid.length; r++)
            for (int c = 0; c < grid[0].length; c++)
                solve(r, c, 0);

        System.out.println("Maximum gold: " + best);
    }
}


