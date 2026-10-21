public class Java_20261025_50_LongestIncreasingPathInMatrix {
    static int[][] matrix;
    static int[][] memo;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static int dfs(int r, int c) {
        if (memo[r][c] != 0) return memo[r][c];

        memo[r][c] = 1;

        for (int d = 0; d < 4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr >= 0 && nc >= 0 &&
                nr < matrix.length && nc < matrix[0].length &&
                matrix[nr][nc] > matrix[r][c]) {

                memo[r][c] = Math.max(
                    memo[r][c], 1 + dfs(nr, nc)
                );
            }
        }

        return memo[r][c];
    }

    static int longestIncreasingPath(int[][] a) {
        matrix = a;
        memo = new int[a.length][a[0].length];

        int best = 0;

        for (int r = 0; r < a.length; r++)
            for (int c = 0; c < a[0].length; c++)
                best = Math.max(best, dfs(r, c));

        return best;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {9, 9, 4},
            {6, 6, 8},
            {2, 1, 1}
        };

        System.out.println(longestIncreasingPath(matrix)); // 4
    }
}


