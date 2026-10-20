public class Java_20261024_41_SolveKnightPlacementProblem {
    static int n = 4;
    static int[][] board = new int[n][n];
    static int bestCount = 0;
    static int[][] bestBoard = new int[n][n];

    static int[] dr = {-2,-2,-1,-1,1,1,2,2};
    static int[] dc = {-1,1,-2,2,-2,2,-1,1};

    static boolean safe(int r, int c) {
        for (int k = 0; k < 8; k++) {
            int nr = r + dr[k], nc = c + dc[k];

            if (nr >= 0 && nc >= 0 && nr < n && nc < n &&
                board[nr][nc] == 1) return false;
        }
        return true;
    }

    static void solve(int pos, int count) {
        if (pos == n * n) {
            if (count > bestCount) {
                bestCount = count;

                for (int i = 0; i < n; i++)
                    bestBoard[i] = board[i].clone();
            }
            return;
        }

        int r = pos / n, c = pos % n;

        if (safe(r, c)) {
            board[r][c] = 1;
            solve(pos + 1, count + 1);
            board[r][c] = 0;
        }

        solve(pos + 1, count);
    }

    public static void main(String[] args) {
        solve(0, 0);

        System.out.println("Maximum knights: " + bestCount);

        for (int[] row : bestBoard) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}


