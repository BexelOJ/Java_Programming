public class Java_20261023_45_FindKnightTours {
    static int n = 5;

    static int[] dr = {-2,-1,1,2,2,1,-1,-2};
    static int[] dc = {1,2,2,1,-1,-2,-2,-1};

    static boolean solve(int[][] board, int r, int c, int step) {
        if (step == n * n) return true;

        for (int k = 0; k < 8; k++) {
            int nr = r + dr[k];
            int nc = c + dc[k];

            if (nr >= 0 && nc >= 0 && nr < n && nc < n &&
                board[nr][nc] == -1) {
                board[nr][nc] = step;

                if (solve(board, nr, nc, step + 1))
                    return true;

                board[nr][nc] = -1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] board = new int[n][n];

        for (int[] row : board)
            java.util.Arrays.fill(row, -1);

        board[0][0] = 0;

        if (solve(board, 0, 0, 1)) {
            for (int[] row : board) {
                for (int x : row)
                    System.out.printf("%2d ", x);
                System.out.println();
            }
        } else {
            System.out.println("No tour found");
        }
    }
}


