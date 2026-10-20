import java.util.Arrays;

public class Java_20261024_28_SolveKnightTourProblem {
    static final int N = 5;
    static int[] dr = {-2,-1,1,2,2,1,-1,-2};
    static int[] dc = {1,2,2,1,-1,-2,-2,-1};

    static boolean solve(int[][] b, int r, int c, int step) {
        if (step == N * N) return true;

        for (int k = 0; k < 8; k++) {
            int nr = r + dr[k], nc = c + dc[k];

            if (nr >= 0 && nc >= 0 && nr < N && nc < N &&
                b[nr][nc] == -1) {
                b[nr][nc] = step;

                if (solve(b, nr, nc, step + 1)) return true;

                b[nr][nc] = -1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] b = new int[N][N];
        for (int[] row : b) Arrays.fill(row, -1);
        b[0][0] = 0;

        if (solve(b, 0, 0, 1)) {
            for (int[] row : b)
                System.out.println(Arrays.toString(row));
        } else {
            System.out.println("No tour found");
        }
    }
}


